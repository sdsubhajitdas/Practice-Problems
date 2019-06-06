# https://www.hackerrank.com/challenges/mark-and-toys/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    06/06/2019
'''


def main():
    n, money = map(int, input().split())
    cost = sorted(list(map(int, input().strip().split())))

    count, i = 0, 0
    while money > 0 and i < n:
        money -= cost[i]
        if money >= 0:
            count += 1
        i += 1
    print(count)


if __name__ == "__main__":
    main()
