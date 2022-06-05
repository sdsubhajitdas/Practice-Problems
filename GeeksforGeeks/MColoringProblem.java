// https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    06/06/2022
*/


class solve {
  public boolean graphColoring(boolean graph[][], int m, int n) {
    int nodeColours[] = new int[n];
    Arrays.fill(nodeColours, -1);
    return this.graphColoringHelper(graph, nodeColours, 0, m);
  }


  private boolean graphColoringHelper(boolean graph[][], int nodeColours[], int currentNode, int m) {
    if(currentNode == graph.length) return true;


    for(int currentColor=0; currentColor<m; currentColor++) {
      if(isSafe(currentNode, currentColor, graph, nodeColours)) {
        nodeColours[currentNode] = currentColor;
        if(this.graphColoringHelper(graph, nodeColours, currentNode+1, m)) return true;
        nodeColours[currentNode] = -1;
      }
    }

    return false;
  }

  private boolean isSafe(int currentNode, int expectedNodeColour, boolean graph[][], int nodeColours[]) {
    for(int node = 0; node<nodeColours.length; node++) {
      if(node != currentNode && graph[currentNode][node]) {
        if(nodeColours[node] == expectedNodeColour) return false;
      }
    }
    return true;
  }
}