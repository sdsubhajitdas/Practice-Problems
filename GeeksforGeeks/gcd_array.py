# https://practice.geeksforgeeks.org/problems/gcd-of-array/0/?track=interview-mathematical
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	13/1/2019
'''


def gcd(*a):
    x = max(a)
    y = min(a)
    while y:
        x, y = y, x % y
    return x


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))

        if n == 1:
            print(arr[0])
            continue

        res=gcd(arr[0], arr[1])
        for i in range(2,n):
            res = gcd(res,arr[i])
        
        print(res)


if __name__ == "__main__":
    main()
