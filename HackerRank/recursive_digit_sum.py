# https://www.hackerrank.com/challenges/recursive-digit-sum
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/05/2019
'''

#!/bin/python3

import math
import os
import random
import re
import sys
# Complete the superDigit function below.

def sum_of_digit(n):
    n = int(n)

    return 9 if (n%9==0) else (n%9)


def superDigit(n, k):
    s = k * sum_of_digit(n)
    return sum_of_digit(s)

if __name__ == '__main__':

    nk = input().split()

    n = nk[0]

    k = int(nk[1])

    result = superDigit(n, k)

    print(result)
