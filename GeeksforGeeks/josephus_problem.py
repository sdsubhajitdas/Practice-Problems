# https://practice.geeksforgeeks.org/problems/josephus-problem/1/?track=sp-recursion&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/07/2019
'''


def josephus(n: int, k: int) -> int:
    if(n == 1):
        return 1

    return (josephus(n-1, k) + k - 1) % n+1


def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        print(josephus(n, k))


if __name__ == "__main__":
    main()
