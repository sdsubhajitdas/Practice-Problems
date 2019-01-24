# https://www.codechef.com/DEC18B/problems/MAXEP
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    13/12/2018
'''

from sys import stdout


def printf(msg, ans=''):
    print(msg, ans)
    stdout.flush()


def dec_skip(step):
    return max(1, step//10)


def main():
    n, c = list(map(int, input().strip().split()))
    coins = 1000
    step = max(1, n//100)
    start, end = 0, n
    while c != 0:
        start += step
        if start >= end:
            if step == 1:
                printf(3, start)
                break
            start -= step
            step = dec_skip(step)
            continue

        printf(1, start)
        res = int(input())
        if res == 0:
            coins -= 1
        elif res == 1:
            if step == 1:
                printf(3, start)
                break
            printf(2)
            coins -= c
            end = min(start, end)
            start -= step
            step = dec_skip(step)


if __name__ == '__main__':
    main()
