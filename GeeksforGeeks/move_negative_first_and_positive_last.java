// https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/11/2020
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
  public static void main(String[] args) {
    int testCases;
    Scanner sc = new Scanner(System.in);
    testCases = sc.nextInt();

    while (testCases != 0) {
      runTestCase(sc);
      testCases--;
    }
    sc.close();
  }

  public static void runTestCase(Scanner sc) {
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    int negative = -1;

    for (int i = 0; i < n; i++) {
      if (arr[i] < 0) {
        negative++;
        if (negative != i) {
          int temp = arr[i];
          arr[i] = arr[negative];
          arr[negative] = temp;
        }
      }
    }
    for(int i=0; i< n ;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}

//
/*
4
9
-12 11 -13 -5 6 -7 5 -3 -6
11
10 11 12 13 0 -2 -4 -6 7 1 -12
5
-5 -4 -3 -2 -1
5
1 2 3 4 5
*/