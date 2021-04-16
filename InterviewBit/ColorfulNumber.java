// https://www.interviewbit.com/problems/colorful-number/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/04/2021
*/

import java.util.*;

public class Solution {
    public int colorful(int num) {
        if(Integer.toString(num).length() == 1) return 1;

        ArrayList<String> sequence = this.getSubSequenceParts(Integer.toString(num));
        HashSet<Integer> table = new HashSet<>();

        for(String n : sequence) {
            int product = this.getDigitProduct(n);
            if(table.contains(product)) return 0;
            table.add(product);
        }

        return 1;
    }

    private int getDigitProduct(String num) {
        if(num.length() == 1) return Integer.parseInt(num);
        int product = 1;

        for(int idx=0; idx<num.length(); idx++) {
            product *= Integer.parseInt(Character.toString(num.charAt(idx)));
        }
        return product;
    }

    private ArrayList<String> getSubSequenceParts(String num) {
        ArrayList<String> sequence = new ArrayList<>();
        int part = 1;

        while(part <= num.length()) {

            for(int idx=0; idx<num.length()-part+1; idx++) {
                sequence.add(num.substring(idx, idx+part));
            }
            part++;
        }

        return sequence;
    }
}
