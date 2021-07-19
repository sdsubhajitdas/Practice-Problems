// https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/roy-and-coin-boxes-1/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    19/07/2021
*/

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxSum=Integer.MIN_VALUE;
        int array[] = new int[n+1];
        int table[];

        for(int day=0; day<m; day++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            if(start == end) continue;

            if(start <= n)
                array[start]++;

            if(end < n)
                array[end+1]--;
        }

        for(int i=1; i<=n; i++) {
            array[i] += array[i-1];
            maxSum = Math.max(maxSum, array[i]);
        }

        table = new int[maxSum+1];

        for(int i=1; i<=n; i++) table[array[i]]++;

        for(int i=maxSum-1; i>=0; i--) table[i] = table[i] + table[i+1];

        int q = sc.nextInt();
        for(int query=0; query<q; query++) {
            int x = sc.nextInt();
            System.out.println(x>maxSum ? 0 : table[x]);  
        }

    }
}
