// https://practice.geeksforgeeks.org/problems/find-the-distance-between-two-nodes/0/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    16/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- != 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();

            if (a == b)
                System.out.println(0);
            else {
                System.out.println(count(Math.max(a, b), Math.min(a, b)));
            }
        }
        sc.close();
    }

    public static int count(int a, int b) {
        int c = 0;
        while (a != b) {

            if (a > b) {
                c++;
                a = a >> 1;
            }

            if (b > a) {
                c++;
                b = b >> 1;
            }
        }

        return c;
    }
}
