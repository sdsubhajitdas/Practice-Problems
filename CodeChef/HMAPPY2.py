# https://www.codechef.com/FEB19B/problems/HMAPPY2
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    3/2/2018
'''


def gcd(x, y):
    x, y = a, b = max(x, y), min(x, y)
    while(y):
        x, y = y, x % y
    return (a*b)//x


def main():
    for _ in range(int(input())):
        n, a, b, k = map(int, input().split())
        ad = n//a
        bd = n//b
        abd = n//gcd(a, b)
        total = ad+bd-(2*abd)
        if total >= k:
            print('Win')
        else:
            print('Lose')


if __name__ == "__main__":
    main()
