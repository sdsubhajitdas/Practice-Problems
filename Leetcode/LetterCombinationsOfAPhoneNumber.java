// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    29/07/2021
*/

import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;

        HashMap<Character,char[]> keypad = new HashMap<>();
        keypad.put('2', "abc".toCharArray());
        keypad.put('3', "def".toCharArray());
        keypad.put('4', "ghi".toCharArray());
        keypad.put('5', "jkl".toCharArray());
        keypad.put('6', "mno".toCharArray());
        keypad.put('7', "pqrs".toCharArray());
        keypad.put('8', "tuv".toCharArray());
        keypad.put('9', "wxyz".toCharArray());
        
        this.generateLetterCombinations(0, digits, new char[digits.length()], keypad, result);

        return result;
    }

    private void generateLetterCombinations(int idx, String digits, char combination[] ,HashMap<Character, char[]> keypad, List<String> result) {
        if(idx == combination.length) {
            result.add(String.valueOf(combination));
            return;
        }

        for(char key: keypad.get(digits.charAt(idx))) {
            combination[idx] = key;
            this.generateLetterCombinations(idx+1, digits , combination, keypad, result);
            combination[idx] = ' ';
        }
    }
}
