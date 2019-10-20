# https://leetcode.com/problems/01-matrix/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/10/2019
'''

import sys


class Solution(object):

    def updateMatrix(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """
        self.rows = len(matrix)
        self.cols = len(matrix[0])

        ans = [[sys.maxsize]*self.cols for _ in range(self.rows)]
        queue = list()

        for i in range(self.rows):
            for j in range(self.cols):
                if(matrix[i][j] == 0):
                    ans[i][j] = 0
                    queue.append((i, j))

        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        while(len(queue) > 0):
            r, c = queue.pop(0)

            for dr, dc in directions:
                if(self.validDims(r+dr, c+dc)):
                    if(ans[r+dr][c+dc] > ans[r][c]+1):
                        ans[r+dr][c+dc] = ans[r][c] + 1
                        queue.append((r+dr, c+dc))

        return ans

    def validDims(self, row, col):
        return (row >= 0 and row < self.rows and col >= 0 and col < self.cols)
