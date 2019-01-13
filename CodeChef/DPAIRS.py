# https://www.codechef.com/JAN19B/problems/DPAIRS
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    6/1/2019
'''


def main():
    n, m = list(map(int, input().strip().split()))
    a = list(map(int, input().strip().split()))
    b = list(map(int, input().strip().split()))

    a = sorted([(a[i],i) for i in range(n)])
    b = sorted([(b[i],i) for i in range(m)])

    for i in range(n):
        print(a[i][1],b[0][1])

    for i in range(1,m):
        print(a[-1][1],b[i][1])

if __name__ == "__main__":
    main()
