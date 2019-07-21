
// Link
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    DD/MM/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- != 0) {
            int n = sc.nextInt();
            int types[] = new int[n];
            int total[] = new int[n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    int x = sc.nextInt();
                    types[i] += x;
                    total[j] += x;
                }
            Arrays.sort(types);
            Arrays.sort(total);
            String res = "Possible";
            for (int i = 0; i < n; i++)
                if(types[i]!=total[i]){
                    res = "Impossible";
                    break;
                }
            System.out.println(res);
        }
        sc.close();
    }
}