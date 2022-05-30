// https://practice.geeksforgeeks.org/problems/subset-sums2234/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    31/05/2022
*/


//User function Template for Java//User function Template for Java
class Solution{
  ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
    ArrayList<Integer> result = new ArrayList<>();

    this.subsetSumsHelper(arr, 0, 0, result);
    return result;
  }

  private void subsetSumsHelper(ArrayList<Integer> arr, int index, int runningSum, ArrayList<Integer> result) {
    if(index == arr.size()) {
      result.add(runningSum);
      return;
    }

    this.subsetSumsHelper(arr, index+1, runningSum + arr.get(index), result);
    this.subsetSumsHelper(arr, index+1, runningSum, result);
  }
}