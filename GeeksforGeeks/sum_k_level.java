
// https://practice.geeksforgeeks.org/problems/binary-tree-k-level-sum/0/?track=sp-trees&batchId=152
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
            int k, level = -1;
            int sum = 0;
            String tree;
            k = sc.nextInt();
            sc.nextLine();
            tree = sc.nextLine();

            for (int i = 0; i < tree.length(); i++) {
                char ele = tree.charAt(i);
                if (ele == '(') {
                    level++;
                } else if (ele == ')') {
                    level--;
                } else if (level == k) {
                    int num = 0;
                    while (tree.charAt(i) != ')' && tree.charAt(i) != '(') {
                        char a = tree.charAt(i);
                        num = num * 10 + Character.getNumericValue(a);
                        i++;
                    }
                    i--;
                    sum += num;
                }
            }
            System.out.println(sum);
        }
    }
}