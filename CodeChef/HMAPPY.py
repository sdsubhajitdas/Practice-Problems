# https://www.codechef.com/OCT18B/problems/HMAPPY
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	28/1/2018
'''


def balloons(a, b, candy):
    total = 0
    for ai, bi in zip(a, b):
        if bi == 0:
            continue
        else:
            total += max(ai - candy//bi, 0)
    return total


def main():
    n, m = map(int, input().strip().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    left, right = 0, max(a)*max(b)

    while left < right:
        mid = (left+right)//2
        balloons_needed = balloons(a, b, mid)
        if balloons_needed <= m:
            right = mid
        else:
            left = mid+1

    print(left)


if __name__ == "__main__":
    main()
