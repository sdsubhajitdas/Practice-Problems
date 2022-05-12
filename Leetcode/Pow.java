// https://leetcode.com/problems/powx-n/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    13/05/2022
*/

import java.util.*;

class Solution {
  public double myPow(double x, int n) {
    double result = 1;
    long nn = n;
    
    if(nn < 0) nn = -1*nn;
    while(nn > 0) {
      if(nn % 2 == 1) {
        result = result * x;
        nn = nn - 1;
      }
      else {
        x = x * x;
        nn = nn/2;
      }
    }

    if(n < 0) result = (double)1/(double)result;

    return result;
  }
}
