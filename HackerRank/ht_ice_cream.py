# https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=search
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/06/2019
'''


def main():
    for _ in range(int(input())):
        m = int(input())
        n = int(input())
        cost = list(map(int, input().strip().split()))

        if n == 2:
            print(1, 2)
            continue

        table = dict()

        for i in range(n):
            find = m - cost[i]
            if(table.get(find, -1) != -1):
                if(table[find] != i):
                    print(table[find]+1, i+1)
                    break
            table[cost[i]] = i


if __name__ == "__main__":
    main()
