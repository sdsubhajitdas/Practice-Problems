# https://www.hackerrank.com/challenges/dynamic-array/problem
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    16/3/2019
'''


import math
import os
import random
import re
import sys


def dynamicArray(n, queries):
    seq_list = []
    for _ in range(n):
        seq_list.append(list())
    last_answer = 0
    result = list()
    for option, x, y in queries:
        seq_index = (x ^ last_answer) % n
        seq = seq_list[seq_index]
        if option == 1:
            seq.append(y)
        elif option == 2:
            last_answer = seq[y % len(seq)]
            result.append(last_answer)
    return result


if __name__ == '__main__':

    nq = input().rstrip().split()

    n = int(nq[0])

    q = int(nq[1])

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    result = dynamicArray(n, queries)

    print(*result, sep='\n')
