# https://practice.geeksforgeeks.org/problems/power-of-numbers/0
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    09/06/2019
'''
import sys
sys.setrecursionlimit(10000)


def my_pow(n: int, r: int) -> int:
    if r == 1:
        return n
    if (r % 2 == 0):
        return (my_pow(n, r//2) * my_pow(n, r//2)) % 1000000007
    else:
        return (n * my_pow(n, r//2) * my_pow(n, r//2)) % 1000000007


def main():
    for _ in range(int(input())):
        n = input()
        r = n[::-1]
        n, r = int(n), int(r)
        print(my_pow(n, r))


if __name__ == "__main__":
    main()
