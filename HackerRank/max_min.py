# https://www.hackerrank.com/challenges/angry-children/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=greedy-algorithms
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/06/2019
'''
import sys

def main():
    n = int(input())
    k = int(input())
    arr = list()
    for _ in range(n):
        arr.append(int(input()))
    arr.sort()
    res = sys.maxsize
    for i in range(k-1, n):
        j = i-k+1
        res = min(res,(arr[i]-arr[j]))
    print(res)

if __name__ == "__main__":
    main()
