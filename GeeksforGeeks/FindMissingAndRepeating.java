// https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    13/08/2021
*/
import java.math.BigInteger;

// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        BigInteger len = BigInteger.valueOf(n);
        BigInteger x = len.multiply(len.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
        BigInteger x2 = len.multiply(len.add(BigInteger.valueOf(1)))
                        .multiply(len.multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(1)))
                        .divide(BigInteger.valueOf(6));
        
        BigInteger y=BigInteger.valueOf(0);
        BigInteger y2=BigInteger.valueOf(0);
        
        for(int num: arr) {
            y= y.add(BigInteger.valueOf(num));
            y2 = y2.add(BigInteger.valueOf(num*num));
        }
        
        BigInteger xmy = x.subtract(y);
        BigInteger x2my2 = x2.subtract(y2);
        BigInteger xpy = x2my2.divide(xmy);
        
        int missingNum = xmy.add(xpy).divide(BigInteger.valueOf(2)).intValue();
        int extraNum = xpy.subtract(BigInteger.valueOf(missingNum)).intValue();
        
        return new int[]{extraNum, missingNum};
    }
}