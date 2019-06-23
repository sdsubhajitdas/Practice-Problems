# https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    22/06/2019
'''
from collections import deque


def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        arr = input().split()
        dq = deque()
        for i in range(n):
            arr[i] = int(arr[i])

        for i in range(k):
            while (dq and arr[i] >= arr[dq[-1]]):
                dq.pop()
            dq.append(i)

        for i in range(k, n):
            print(arr[dq[0]], end=' ')

            while (dq and dq[0] <= i-k):
                dq.popleft()

            while(dq and arr[i] >= arr[dq[-1]]):
                dq.pop()
            dq.append(i)
        
        print(arr[dq[0]])


if __name__ == "__main__":
    main()
