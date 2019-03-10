# https://www.codechef.com/FEB19B/problems/MAGICJAR
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    5/2/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().split()))

        count = 0
        for i in arr:
            count += (i-1)

        print(count+1)


if __name__ == "__main__":
    main()
