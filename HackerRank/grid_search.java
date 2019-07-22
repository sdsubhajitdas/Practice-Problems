
// https://www.hackerrank.com/challenges/the-grid-search/problem
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    22/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- != 0) {
            int gr, gc, pr, pc;
            String grid[], pat[];

            gr = sc.nextInt();
            gc = sc.nextInt();
            sc.nextLine();
            grid = new String[gr];
            for (int i = 0; i < gr; i++)
                grid[i] = sc.nextLine().trim();

            pr = sc.nextInt();
            pc = sc.nextInt();
            sc.nextLine();
            pat = new String[pr];
            for (int i = 0; i < pr; i++)
                pat[i] = sc.nextLine().trim();

            boolean flag = false;
            for (int i = 0; i <= gr - pr; i++){
                for (int j = 0; j <= gc - pc; j++){
                    if (matchPatter(grid, pat, i, j)) {
                        //System.out.println("Cor:\t"+i+" "+j);
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }

    public static boolean matchPatter(String grid[], String pat[], int i, int j) {
        //System.out.println("\tSearching for G("+i+","+j+")");
        for (int m = 0; m < pat.length; m++) {
            for (int n = 0; n < pat[0].length(); n++) {
                //System.out.println("\t\tMatch G("+(i+m)+","+(j+n)+")\tP("+m+","+n+")");
                if (grid[i + m].charAt(j + n) != pat[m].charAt(n))
                    return false;
            }
        }
        //System.out.println("\n\n\n");
        return true;
    }
}