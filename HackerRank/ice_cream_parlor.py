# https://www.hackerrank.com/challenges/icecream-parlor/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    04/06/2019
'''


def main():
    for _ in range(int(input())):
        m = int(input())
        n = int(input())
        cost = list(map(int, input().strip().split()))

        if n == 2:
            print(1, 2)
            return
        for i in range(n):
            found = False
            flavor = i
            find = m - cost[i]
            for j in range(i+1, n):
                if cost[j] == find and flavor != j:
                    print(flavor+1, j+1)
                    found = not found
                    break
            if (found):
                break


if __name__ == "__main__":
    main()
