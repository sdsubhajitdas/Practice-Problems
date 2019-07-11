# https://practice.geeksforgeeks.org/problems/number-of-paths/0/?track=sp-recursion&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/07/2019
'''


def count_path(n, m, i, j):
    if(i == n and j == m):
        return 1
    if(i > n or j > m):
        return 0
    if(i <= 0 or j <= 0):
        return 0

    return count_path(n, m, i+1, j) + count_path(n, m, i, j+1)


def main():
    for _ in range(int(input())):
        n, m = map(int, input().split())

        count = count_path(n, m, 1, 1)
        print(count)


if __name__ == "__main__":
    main()
