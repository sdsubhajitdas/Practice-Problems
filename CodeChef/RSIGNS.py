# https://www.codechef.com/JUNE19B/problems/RSIGNS
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    09/06/2019
'''

mod = 10**9 + 7


def fast_pow(x, k):
    if (k == 0):
        return 1
    if (k % 2 == 0):
        return (fast_pow((x*x) % mod, k//2))
    else:
        return (x * fast_pow((x*x) % mod, k//2)) % mod


def main2():
    for _ in range(int(input())):
        k = int(input())
        count = fast_pow(2, k-1)
        print((count*10) % mod)


if __name__ == "__main__":
    main2()
