# https://leetcode.com/problems/perfect-squares/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''


class Solution:
    def numSquares(self, n: int) -> int:
        queue = [0]
        visited = set()
        level = 1

        squares = list()
        i = 1
        while(i*i <= n):
            squares.append(i*i)
            i += 1

        while(len(queue) > 0):
            size = len(queue)
            for _ in range(size):
                sumSoFar = queue.pop(0)
                for sq in squares:
                    s = sumSoFar + sq
                    if(s == n):
                        return level
                    elif(s > n):
                        break
                    if(s not in visited):
                        queue.append(s)
                        visited.add(s)
            level += 1
        return 0
