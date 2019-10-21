# https://leetcode.com/problems/pascals-triangle-ii/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/10/2019
'''


class Solution(object):
    def getRow(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        numRows+=1
        if(numRows == 0):
            return list()

        pascal = [[0]*_ for _ in range(1, numRows+1)]

        for i in range(numRows):
            for j in range(i+1):
                if(pascal[i][j] == 0):
                    self.pascalRecursive(pascal, i, j)

        return pascal[-1]

    def pascalRecursive(self, pascal, i, j):
        if(pascal[i][j] != 0):
            return pascal[i][j]

        if(j == 0 or i == j):
            pascal[i][j] = 1
            return 1

        pascal[i][j] = self.pascalRecursive(
            pascal, i-1, j-1) + self.pascalRecursive(pascal, i-1, j)
        return pascal[i][j]


