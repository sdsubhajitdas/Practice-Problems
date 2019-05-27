# https://www.hackerrank.com/challenges/the-power-sum
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/05/2019
'''


import math
import os
import random
import re
import sys

# Complete the powerSum function below.


def powerSum(x, n, d):
    #print(f'{" "*d}powerSum({x},{n},{d})')
    x = x - (d ** n)
    if x == 0:
        return 1
    if x < 0:
        return 0
    a,b = x, x + (d ** n)
    d+=1
    return powerSum(a, n, d) + powerSum(b, n, d)


if __name__ == '__main__':

    X = int(input())

    N = int(input())

    result = powerSum(X, N, 1)

    print(result)
