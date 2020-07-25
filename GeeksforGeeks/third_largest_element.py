# https://www.geeksforgeeks.org/third-largest-element-array-distinct-elements/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    25/07/2020
'''
import sys

def thirdLargest(arr, n):
    if(not arr or len(arr)<3):
        return -1
    
    first = second = third = (sys.maxsize-1)*-1

    for num in arr:
        if(num>=first):
            third = second
            second = first
            first = num
        elif(num>=second):
            third = second
            second = num
        elif(num>=third):
            third = num

    return third
