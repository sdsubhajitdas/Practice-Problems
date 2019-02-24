# https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	21/2/2019
'''


import math
import os
import random
import re
import sys


def jumpingOnClouds(n, c):
    jump = 0
    cur_index = 0

    while cur_index < n-1:
        next1, next2 = min(cur_index+1, n-1), min(cur_index+2, n-1)
        if c[next2] == 0:
            jump += 1
            cur_index = next2
        elif c[next1] == 0:
            jump += 1
            cur_index = next1
        if cur_index == n-1:
            break

    return jump


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    c = list(map(int, input().rstrip().split()))

    result = jumpingOnClouds(n, c)

    fptr.write(str(result) + '\n')

    fptr.close()
