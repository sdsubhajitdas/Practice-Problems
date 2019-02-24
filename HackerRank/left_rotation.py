# https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
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


def rotLeft(a, d):
    if d == len(a):
        return a

    left = a[:d]
    right = a[d:]

    right.extend(left)
    return right


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nd = input().split()

    n = int(nd[0])

    d = int(nd[1])

    a = list(map(int, input().rstrip().split()))

    result = rotLeft(a, d)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
