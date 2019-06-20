# https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        for idx in range(1, n):
            print(arr[idx] if(arr[idx]<arr[idx-1]) else '-1', end=' ')
        print('-1')


if __name__ == "__main__":
    main()
