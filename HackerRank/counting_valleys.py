# https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
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


def countingValleys(n, s):
    count = 0
    level = 0
    last_sea_level = True
    for step in s:
        if step == 'U':
            level += 1
            if level >= 0:
                last_sea_level = True
        elif step == 'D':
            level -= 1

        if last_sea_level and level < 0:
            count += 1
            last_sea_level = False
    return count


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    result = countingValleys(n, s)

    fptr.write(str(result) + '\n')

    fptr.close()
