
// Link
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, rq, cq, count = 0;
        n = sc.nextInt();
        k = sc.nextInt();
        rq = sc.nextInt();
        cq = sc.nextInt();
        HashMap<String, Boolean> block = new HashMap<>();
        for (int i = 0; i < k; i++) {
            String cor = Integer.toString(sc.nextInt()) + " " + Integer.toString(sc.nextInt());
            block.put(cor, true);
        }

        count += move(n, rq, cq, 1, 0, block);  // Up
        count += move(n, rq, cq, -1, 0, block); // Down
        count += move(n, rq, cq, 0, -1, block); // Left
        count += move(n, rq, cq, 0, 1, block);  // Right
        count += move(n, rq, cq, 1, 1, block);  // Up-Right
        count += move(n, rq, cq, -1, -1, block);// Down-Left
        count += move(n, rq, cq, 1, -1, block); // Up-Left
        count += move(n, rq, cq, -1, 1, block); // Down-Right

        System.out.print(count);

        sc.close();
    }

    public static int move(int n, int i, int j, int di, int dj, HashMap<String, Boolean> block) {
        i+=di;
        j+=dj;
        //System.out.println("Cor: "+i+"-"+j);
        int count = 0;
        while(isSafe(n, i, j) && !isBlocked(i, j, block)){
            count+=1;
            i+=di;
            j+=dj;
        }
        
        return count;
    }

    public static boolean isSafe(int n,int i, int j){
        if(i>=1 && i<=n && j>=1 && j<=n)
            return true;
        return false;
    }

    public static boolean isBlocked(int i, int j, HashMap <String, Boolean> block){
        String cor = Integer.toString(i) + " " + Integer.toString(j);
        if(block.getOrDefault(cor, false))
            return true;
        return false;
    }

}