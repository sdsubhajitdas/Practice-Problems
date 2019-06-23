# https://practice.geeksforgeeks.org/problems/lcm-and-gcd/0/?track=sp-mathematics&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    23/06/2019
'''


def gcd(a: int, b: int) -> int:
    a, b = max(a, b), min(a, b)
    while(b != 0):
        a, b = b, a % b
    return a


def lcm(a: int, b: int) -> int:
    return (a*b)//gcd(a, b)


def main():
    for _ in range(int(input())):
        a, b = map(int, input().split())
        print(lcm(a, b), gcd(a, b))


if __name__ == "__main__":
    main()
