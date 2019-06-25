# https://practice.geeksforgeeks.org/problems/number-of-open-doors/0/?track=sp-mathematics&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    24/06/2019
'''

import math


def main():
    for _ in range(int(input())):
        n = int(input())
        print(math.floor(math.sqrt(n)))


if __name__ == "__main__":
    main()
