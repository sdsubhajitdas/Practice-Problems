# https://leetcode.com/problems/flood-fill/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/10/2019
'''


class Solution(object):
    def floodFill(self, image, sr, sc, newColor):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type newColor: int
        :rtype: List[List[int]]
        """
        self.rows = len(image)
        self.cols = len(image[0])

        self.newColor = newColor
        self.oldColor = image[sr][sc]

        if(self.newColor == self.oldColor):
            return image

        self.floodFillHelper(image, sr, sc)

        return image

    def isValidDims(self, r, c):
        return (r >= 0 and r < self.rows and c >= 0 and c < self.cols)

    def floodFillHelper(self, image, r, c):

        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        if not self.isValidDims(r, c):
            return

        if(image[r][c] != self.oldColor or image[r][c] == self.newColor):
            return

        image[r][c] = self.newColor

        for dr, dc in directions:
            self.floodFillHelper(image, r+dr, c+dc)
