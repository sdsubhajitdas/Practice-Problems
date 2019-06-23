# https://practice.geeksforgeeks.org/problems/number-of-occurrence/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    23/06/2019
'''


def countX(arr: list, idx: int, x: int) -> int:
    if (arr[idx] != x):
        return 0
    arr[idx] = None
    return 1 + countX(arr, idx+1, x) + countX(arr, idx-1, x)


def main():
    for _ in range(int(input())):
        n, x = map(int, input().split())
        arr = list(map(int, input().strip().split()))

        l, h = 0, n-1
        idx = None
        while(l <= h):
            m = (l+h)//2
            if (arr[m] > x):
                h = m - 1
            elif (arr[m] < x):
                l = m + 1
            elif (arr[m] == x):
                idx = m
                break
        print(countX(arr, idx, x) if(idx != None) else -1)


if __name__ == "__main__":
    main()
