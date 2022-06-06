// https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/06/2022
*/

class Solution {
  public static ArrayList<String> findPath(int[][] matrix, int n) {
    ArrayList<String> result = new ArrayList<>();
    if(matrix[0][0] == 0) return result;

    findPathHelper(matrix, new boolean[n][n], 0, 0, "", result);
    return result;    
  }

  private static void findPathHelper(int[][] matrix, boolean[][] visited, int row, int col, String path, ArrayList<String> result) {

    if(row == matrix.length-1 && col == matrix.length-1) {
      result.add(path);
      return;
    }

    int dx[] = {1,0,0,-1};
    int dy[] = {0,-1,1,0};

    String move = "DLRU";
    for(int i=0; i<4; i++) {
      int nextRow = row + dx[i];
      int nextCol = col + dy[i];
      int n = matrix.length;
      if(nextRow>=0 && nextCol>=0 && nextRow<n && nextCol<n && !visited[nextRow][nextCol] && matrix[nextRow][nextCol] == 1) {
        visited[row][col] = true;
        findPathHelper(matrix, visited, nextRow, nextCol, path + move.charAt(i), result);
        visited[row][col] = false;
      }
    }
  }
}