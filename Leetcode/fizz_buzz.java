// https://leetcode.com/problems/fizz-buzz/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    29/11/2020
*/
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> fizzBuzzList = new ArrayList<>();
        for(int i=1; i<=n;i++){
            fizzBuzzList.add(helperFizzBuzz(i));
        }
        return fizzBuzzList;
        
    }

    private String helperFizzBuzz(int n){
        String fizzBuzz = "";
        if(n % 3 == 0)
            fizzBuzz += "Fizz";
        if(n % 5 == 0)
            fizzBuzz += "Buzz";
        return (fizzBuzz == "")? Integer.toString(n) :fizzBuzz;
    }
}