# https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/06/2019
'''
import sys


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        m = int(input())
        arr.sort(reverse=True)
        diff = sys.maxsize
        for idx in range(n-m+1):
            if (arr[idx] - arr[idx+m-1] < diff):
                diff = arr[idx] - arr[idx+m-1]
        print(diff)


if __name__ == "__main__":
    main()
