# https://www.hackerrank.com/challenges/greedy-florist/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/06/2019
'''


def main():
    n, k = map(int, input().split())
    arr = list(map(int, input().strip().split()))
    arr.sort()
    turn = 1
    i = n-1
    s = 0
    while(i >= 0):
        j = 0
        while(j < k and i >= 0):
            s += arr[i] * turn
            j += 1
            i -= 1
        turn += 1

    print(s)


if __name__ == "__main__":
    main()
