// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/11/2020
*/
import java.util.Arrays;

class Solution {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> possible = new ArrayList<Boolean>();

    int maxCandies = Arrays.stream(candies).max().getAsInt();

    for (int candy : candies) {
      possible.add(candy + extraCandies >= maxCandies);
    }

    return possible;
  }
}
