# http://codeforces.com/contest/1162/problem/0
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    4/5/2019
'''


def main():
    n, h, m = map(int, input().strip().split())
    restricts = [list(map(int, input().strip().split())) for _ in range(m)]
    houses = list()

    for house in range(1, n+1):
        house_height = h
        for l, r, x in restricts:
            if house >= l and house <= r:
                house_height = min(house_height, x)
        houses.append(house_height ** 2)

    print(sum(houses))

if __name__ == '__main__':
    main()
