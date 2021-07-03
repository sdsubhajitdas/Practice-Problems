// https://leetcode.com/problems/count-sub-islands/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    03/07/2021
*/

import java.util.*;

class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int rows = grid1.length;
        int cols = grid1[0].length;

        boolean visited[][] = new boolean[rows][cols];
        int subIslandCount = 0;


        for(int r=0; r<rows; r++) {
            for(int c=0; c<cols; c++) {
                if(grid2[r][c] == 1 && !visited[r][c]) {
                    Queue<Integer> rQueue = new LinkedList<>();
                    Queue<Integer> cQueue = new LinkedList<>();
                    ArrayList<Integer> rList = new ArrayList<>();
                    ArrayList<Integer> cList = new ArrayList<>();

                    // System.out.println("Starting at pos: "+r+","+c);

                    rQueue.add(r);
                    cQueue.add(c);

                    while(!rQueue.isEmpty()) {
                        // System.out.println("Is Queue empty:("+rQueue.size()+") "+rQueue.isEmpty());
                        int i = rQueue.poll();
                        int j = cQueue.poll();

                        // System.out.println("At pos: "+i+","+j+", Value: "+grid2[i][j]);

                        if(grid2[i][j] == 1 && !visited[i][j]) {
                            rList.add(i);
                            cList.add(j);
                            visited[i][j] = true;


                            // System.out.println("Is Valid: "+(i-1)+","+j+": "+isValid(i-1, j, rows, cols));
                            if(isValid(i-1, j, rows, cols)) {
                                rQueue.add(i-1);
                                cQueue.add(j);
                            }
                            
                            // System.out.println("Is Valid: "+(i+1)+","+j+": "+isValid(i+1, j, rows, cols));
                            if(isValid(i+1, j, rows, cols)) {
                                rQueue.add(i+1);
                                cQueue.add(j);
                            }

                            // System.out.println("Is Valid: "+i+","+(j-1)+": "+isValid(i, j-1, rows, cols));
                            if(isValid(i, j-1, rows, cols)) {
                                rQueue.add(i);
                                cQueue.add(j-1);
                            }

                            // System.out.println("Is Valid: "+i+","+(j+1)+": "+isValid(i, j+1, rows, cols));
                            if(isValid(i, j+1, rows, cols)) {
                                rQueue.add(i);
                                cQueue.add(j+1);
                            }
                        }

                    }
                    
                    boolean breakFlag = false;
                    for(int idx=0; idx<rList.size(); idx++) {
                        if(grid1[rList.get(idx)][cList.get(idx)] != 1) {
                            breakFlag = true;
                            break;
                        }
                    }

                    if(!breakFlag) subIslandCount += 1;
                }
            }
        }

        return subIslandCount;
        
    }

    private boolean isValid(int i, int j, int rows, int cols) {
        if(i<0 || i>=rows) return false;
        if(j<0 || j>=cols) return false;

        return true;
    }
}