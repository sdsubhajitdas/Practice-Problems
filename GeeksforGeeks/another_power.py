# https://practice.geeksforgeeks.org/problems/check-if-a-number-is-power-of-another-number/0/?track=sp-mathematics&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    23/06/2019
'''
from math import log


def main():
    for _ in range(int(input())):
        x, y = map(int, input().split())
        if(x == 0 or y == 0 or log(x) == 0):
            print(0)
            continue
        res = log(y)/log(x)
        print(1 if(int(res)-res == 0) else 0)


if __name__ == "__main__":
    main()
