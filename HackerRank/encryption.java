
// https://www.hackerrank.com/challenges/encryption/problem
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
        int len, r, c;
        String msg = sc.nextLine();
        String encode = "";
        msg = msg.replace(" ", "");
        len = msg.length();
        r = (int) Math.floor(Math.sqrt(len));
        c = (int) Math.ceil(Math.sqrt(len));
        if(r*c<len)
            r++;
        if(r*(c-1) >= len)
            c--;
        
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                int idx = j+(i*c);
                if(idx<len)
                    encode+=msg.charAt(idx);
            }
            encode += " ";
        }

        System.out.println(encode);
        
        sc.close();
    }
}

chillout

2,3

c h i
l l o
u t 