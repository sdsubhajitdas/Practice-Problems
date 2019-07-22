
// https://www.hackerrank.com/challenges/bigger-is-greater/problem
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
        sc.nextLine();
        while (tc-- != 0) {
            String msg = sc.nextLine();
            char msgArr[] = msg.toCharArray();
            
            if(nextPermutation(msgArr))
                System.out.println(msgArr);
            else
                System.out.println("no answer");
        }
        sc.close();
    }

    public static boolean nextPermutation(char data[]) {
        if (data.length <= 1)
            return false;
        int last = data.length - 2;

        while (last >= 0) {
            if (data[last] < data[last + 1])
                break;
            last--;
        }

        if (last < 0)
            return false;

        int nextG = data.length - 1;
        for (int i = data.length - 1; i > last; i--) {
            if(data[i]>data[last]){
                nextG = i;
                break;
            }
        }

        char temp = data[nextG];
        data[nextG] = data[last];
        data[last] = temp;

        last++;
        nextG = data.length -1;
        while(last<nextG){
            temp = data[nextG];
            data[nextG] = data[last];
            data[last] = temp;
            last++;
            nextG--;
        }

        return true;
    }
}