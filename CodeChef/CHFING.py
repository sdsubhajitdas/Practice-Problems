# https://www.codechef.com/JUNE19B/problems/CHFING
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    14/06/2019
'''


def main():
    mod = int(10e9 + 7)
    for _ in range(int(input())):
        n, k = map(int, input().split())
        ans = k-1
        if (k > n):
            k =k - n
            n -= 1
            time = k // n
            ans += k + (k*time)-(n*((time*(time+1))//2))
        print(ans % mod)


if __name__ == "__main__":
    main()