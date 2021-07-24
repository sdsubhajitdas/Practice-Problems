// https://leetcode.com/problems/course-schedule-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    24/07/2021
*/

import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        Stack<Integer> stack = new Stack<Integer>();
        boolean visited[] = new boolean[numCourses];
        boolean dfsVisited[] = new boolean[numCourses];

        while(numCourses !=0) {
            graph.add(new ArrayList<Integer>());
            numCourses--;
        }
        numCourses = graph.size();
        for(int i=0; i<prerequisites.length; i++) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }


        for(int node=0; node<numCourses; node++) {
            if(!visited[node]) {
                if (this.dfs(node, graph, visited, dfsVisited, stack)) {
                    return new int[0];
                }
            }
        }
        
        int result[] = new int[stack.size()];

        for(int i=0; i<numCourses; i++) {
            result[i] = stack.pop();
        }

        return result;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean visited[], boolean dfsVisited[], Stack<Integer> stack) {
        visited[node] = true;
        dfsVisited[node] = true;

        for(Integer childNode: graph.get(node)) {
            if(!visited[childNode]) {
                if(this.dfs(childNode, graph, visited, dfsVisited, stack)) {
                    stack.add(node);
                    return true;
                }
            }
            else if(dfsVisited[childNode]) {
                stack.add(node);
                return true;
            }
        }

        dfsVisited[node] = false;
        stack.add(node);
        return false;
    }

}