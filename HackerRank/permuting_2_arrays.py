# https://www.hackerrank.com/challenges/two-arrays/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    06/06/2019
'''


def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        a = sorted(list(map(int, input().strip().split())))
        b = sorted(list(map(int, input().strip().split())), reverse=True)

        i, j = 0, 0
        count = 0
        while i < n or j < n:
            if ((a[i] + b[j]) >= k):
                count += 1
            i += 1
            j += 1

        print("YES" if count == n else "NO")


if __name__ == "__main__":
    main()
