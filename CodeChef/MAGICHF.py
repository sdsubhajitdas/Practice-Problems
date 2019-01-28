# https://www.codechef.com/SEPT18B/problems/MAGICHF
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	28/1/2018
'''


def main():
    for _ in range(int(input())):
        n, x, s = map(int, input().split())
        arr = [False]*(n+1)
        arr[0], arr[x] = None, True
        for _ in range(s):
            a, b = map(int, input().split())
            arr[a], arr[b] = arr[b], arr[a]

        print(arr.index(True))


if __name__ == "__main__":
    main()
