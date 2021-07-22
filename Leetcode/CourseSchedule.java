// https://leetcode.com/problems/course-schedule/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    22/07/2021
*/

import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean visited[] = new boolean[numCourses];
        boolean dfsVisited[] = new boolean[numCourses];


        for(int i=0; i<numCourses; i++) graph.add(new ArrayList<Integer>());

        for(int i=0; i<prerequisites.length; i++) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        for(int i=0; i<numCourses; i++) {
            if(!visited[i]) {
                if (this.checkDFSCycle(i, graph, dfsVisited, visited)) return false;
            }
        }

        return true;
    }

    private boolean checkDFSCycle(int node, ArrayList<ArrayList<Integer>> graph, boolean dfsVisited[], boolean visited[]) {
        visited[node] = true;
        dfsVisited[node] = true;

        for(Integer childNode: graph.get(node)) {
            if(!visited[childNode]) {
                if(this.checkDFSCycle(childNode, graph, dfsVisited, visited)) return true;
            }
            else if(dfsVisited[childNode]) return true;
        }

        dfsVisited[node] = false;
        return false;
    }
}