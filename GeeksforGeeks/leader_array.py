# https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/06/2019
'''
from sys import stdin, stdout


def main():
    for _ in range(int(input())):
        n = int(stdin.readline())
        arr = list(map(int, stdin.readline().strip().split()))
        m = arr[-1]
        leader = list()
        for i in range(n-1, -1, -1):
            if (arr[i] >= m):
                m = arr[i]
                #print(m, end=' ')
                leader.insert(0, str(m))
        stdout.write(' '.join(leader)+'\n')


if __name__ == "__main__":
    main()
