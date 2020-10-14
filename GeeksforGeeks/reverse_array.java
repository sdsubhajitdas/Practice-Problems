// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    DD/MM/2020
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = Integer.parseInt(sc.nextLine());

        while(testCases != 0){
            testCases--;
            runTestCase(sc);
        }
        sc.close();
    }

    public static void runTestCase(Scanner sc){
        char alphabets[] = sc.nextLine().toCharArray();

        for(int i=0; i<alphabets.length/2; i++){
            char temp = alphabets[i];
            alphabets[i] = alphabets[alphabets.length-i-1];
            alphabets[alphabets.length-i-1] = temp;
        }
        System.out.println(String.valueOf(alphabets));
    }
}