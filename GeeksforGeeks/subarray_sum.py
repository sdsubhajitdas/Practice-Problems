# https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    22/06/2019
'''


def main():
    for _ in range(int(input())):
        n, s = map(int, input().split())
        arr = list(map(int, input().strip().split()))
        i, j = 0, 0
        printed = False
        while (i < n):
            ts = 0
            j = i
            while(ts < s and j<n):
                ts += arr[j]
                j += 1
            if (ts == s):
                print(i+1, j)
                printed = True
                break
            i += 1

        if not printed:
            print(-1)


if __name__ == "__main__":
    main()
