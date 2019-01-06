# https://www.codechef.com/DEC18B/problems/MAXEP
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    13/12/2018
    Status - Partial
'''

from sys import stdout


def main():
    n, c = list(map(int, input().strip().split()))
    high, low = n, 1
    tc, x = 1000, 0

    while tc > 0 and high > low:
        mid_low = low + (high-low)//3
        mid_high = high - (high-low)//3

        tc -= 1
        print("1", mid_high)
        stdout.flush()
        result = int(input())
        if result == 0:
            low = mid_high + 1
            continue
        elif result == 1:
            high = mid_high - 1
            tc -= c
            print("2")
            stdout.flush()

        tc -= 1
        print("1", mid_low)
        stdout.flush()
        result = int(input())
        if result == 0:
            low = mid_low + 1
            continue
        elif result == 1:
            high = mid_low - 1
            tc -= c
            print("2")
            stdout.flush()

    print("3", low)


if __name__ == '__main__':
    main()
