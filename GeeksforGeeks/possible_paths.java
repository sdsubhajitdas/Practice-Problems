
// https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right/0/?track=sp-dynamic-programming&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    18/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        int MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- != 0) {
            int r, c;
            int matrix[][];
            r = sc.nextInt();
            c = sc.nextInt();
            matrix = new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0; j<c; j++){
                    if(i ==0)
                        matrix[i][j] = 1;
                    else if(j == 0)
                        matrix[i][j] = 1;
                    else{
                        matrix[i][j] = (matrix[i-1][j] + matrix[i][j-1])%MOD;
                    }
                }
            }
            System.out.println(matrix[r-1][c-1]);
        }
        sc.close();
    }
}