# https://www.geeksforgeeks.org/find-second-largest-element-array/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/07/2020
'''
import math


def largestAndSecondLargest(sizeOfArray, arr):
    first = second = math.inf * -1

    for num in arr:
        if(first < num):
            second = first
            first = num
        elif(second < num and num != first):
            second = num
    return [first, -1 if (first == second or second == math.inf*-1) else second]
