# https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
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


def repeatedString(s, n):
    s_a = s.count('a')
    rep = n//len(s)
    cut_extra = n - (len(s)*rep)
    cut_a = s[:cut_extra].count('a')

    return (rep*s_a)+cut_a


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()
