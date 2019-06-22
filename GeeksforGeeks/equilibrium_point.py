# https://practice.geeksforgeeks.org/problems/equilibrium-point/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    22/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        if (n == 1):
            print(1)
            continue

        left = 0
        right = sum(arr) - arr[0]
        printed = False
        for i in range(n-1):
            if (left == right):
                print(i+1)
                printed = True
                break
            left += arr[i]
            right -= arr[i+1]

        if (left == right and not printed):
            print(n)
            printed = True

        if not printed:
            print(-1)


if __name__ == "__main__":
    main()
