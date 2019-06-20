# https://practice.geeksforgeeks.org/problems/sort-in-specific-order/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        for i, ai in enumerate(arr):
            if (ai % 2 == 1):
                arr[i] *= -1
        arr.sort()
        for i, ai in enumerate(arr):
            if (ai < 0):
                arr[i] *= -1
        print(*arr)


if __name__ == "__main__":
    main()
