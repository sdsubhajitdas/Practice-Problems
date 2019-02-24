# https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	24/2/2019
'''

import math
import os
import random
import re
import sys


def get_sum(arr, i, j):
    s = 0
    for x in range(i, i+3):
        for y in range(j, j+3):
            s += arr[x][y]

    s = s - arr[i+1][j] - arr[i+1][j+2]
    return s


def hourglassSum(arr):
    s = list()
    for i in range(0, 4):
        for j in range(0, 4):
            s.append(get_sum(arr, i, j))

    return max(s)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
