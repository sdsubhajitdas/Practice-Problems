# https://leetcode.com/problems/number-of-islands/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        if(grid == None or len(grid) == 0):
            return 0

        visited = [[False]*len(grid[0]) for _ in range(len(grid))]
        isLandCount = 0

        for i in range(len(grid)):
            for j in range(len(grid[0])):

                if(not visited[i][j]):
                    if(self.BFSTraverse(grid, visited, i, j) == True):
                        isLandCount += 1

        return isLandCount

    def BFSTraverse(self, grid, visited, i, j):
        if(grid[i][j] == '0' or visited[i][j]):
            return False

        rows, cols = len(grid), len(grid[0])

        queue = [(i, j)]

        while(len(queue) > 0):
            x, y = queue.pop(0)

            if(grid[x][y] == '1' and not visited[x][y]):

                if(x > 0):
                    queue.append((x-1, y))

                if(x < rows-1):
                    queue.append((x+1, y))

                if(y > 0):
                    queue.append((x, y-1))

                if(y < cols-1):
                    queue.append((x, y+1))

            visited[x][y] = True

        return True
