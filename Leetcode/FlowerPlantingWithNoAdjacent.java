// https://leetcode.com/problems/flower-planting-with-no-adjacent/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    06/06/2022
*/

import java.util.*;

class Solution {
  public int[] gardenNoAdj(int n, int[][] paths) {
    int answer[] = new int[n];
    this.helper(0, paths, answer);
    return answer;
  }

  private boolean helper(int currentGarden, int paths[][], int answer[]) {
    if(currentGarden == answer.length) return true;

    for(int currentColor=1; currentColor<=4; currentColor++) {
      if(this.isSafe(paths, currentGarden, currentColor, answer)) {
        answer[currentGarden] = currentColor;
        if(this.helper(currentGarden+1, paths, answer)) return true;
        answer[currentGarden] = 0;
      }
    }

    return false;
  }

  private boolean isSafe(int paths[][], int currentNode, int expectedColour, int answer[]) {

    for(int pair[]: paths) {
      if(pair[0]-1 == currentNode && answer[pair[1]-1] == expectedColour) return false;
      if(pair[1]-1 == currentNode && answer[pair[0]-1] == expectedColour) return false;
    }
    return true;
  }
}