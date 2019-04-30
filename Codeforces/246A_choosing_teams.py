# http://codeforces.com/problemset/problem/432/A
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/4/2019
'''


def main():
    n, k = map(int, input().strip().split())
    times = list(map(int, input().strip().split()))
    times.sort()
    count = 0
    k = 5 - k

    for index in range(0, n, 3):
        if not (index + 2 >= n):
            if times[index] <= times[index+1] <= times[index+2] <= k:
                count += 1

    print(count)


if __name__ == '__main__':
    main()
