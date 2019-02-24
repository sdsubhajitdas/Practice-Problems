# https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	18/2/2019
'''


import math
import os
import random
import re
import sys


def sockMerchant(n, arr):
    col = list()
    res = 0
    for idx, sock in enumerate(arr):
        if sock not in col:
            col.append(sock)
        else:
            res += 1
            col.pop(col.index(sock))

    return res


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()
