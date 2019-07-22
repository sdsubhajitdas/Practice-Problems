
// https://www.hackerrank.com/challenges/3d-surface-area/problem
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

        int r, c;
        r = sc.nextInt();
        c = sc.nextInt();
        int board[][] = new int[r + 2][c + 2];

        for (int i = 0; i <= r + 1; i++)
            for (int j = 0; j <= c + 1; j++)
                if (i == 0 || j == 0 || i == r + 1 || j == c + 1)
                    board[i][j] = 0;
                else
                    board[i][j] = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= r; i++)
            for (int j = 1; j <= c; j++)
                count += countSurface(board, i, j);

        count += r * c;
        System.out.println(count);

        sc.close();

    }

    public static int countSurface(int board[][], int i, int j) {
        int count = 1;
        if (board[i][j] > board[i][j - 1])
            count += board[i][j] - board[i][j - 1];
        if (board[i][j] > board[i][j + 1])
            count += board[i][j] - board[i][j + 1];
        if (board[i][j] > board[i - 1][j])
            count += board[i][j] - board[i - 1][j];
        if (board[i][j] > board[i + 1][j])
            count += board[i][j] - board[i + 1][j];
        return count;
    }
}