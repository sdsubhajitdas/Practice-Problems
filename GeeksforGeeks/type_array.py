# https://practice.geeksforgeeks.org/problems/type-of-array/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        a = list(map(int, input().strip().split()))
        i = 0
        m = max(a)
        while(i < n-1 and a[i] < a[i+1]):
            i += 1
        if (i == n-1):
            print(m, 1)
            continue

        if (i == 0):
            while(i < n-1 and a[i] > a[i+1]):
                i += 1
            if (i == n-1):
                print(m, 2)
                continue
            if(a[0] < a[i+1]):
                print(m, 3)
            else:
                print(m, 4)
            continue
        if(i < n-1 and a[0] > a[i+1]):
            print(m, 4)
        else:
            print(m, 3)


if __name__ == "__main__":
    main()
