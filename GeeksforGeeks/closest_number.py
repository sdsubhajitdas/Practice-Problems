# https://practice.geeksforgeeks.org/problems/closest-number/0/?track=interview-mathematical
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	13/1/2019
'''


def main():
    for _ in range(int(input())):
        n, m = map(int, input().strip().split())
        neg = False
        if n < 0:
            neg = not neg
        n, m = abs(n), abs(m)
        l = n // m
        h = l+1
        res = 0
        if (n-(l*m)) < ((h*m)-n):
            res = l*m
        elif (n-(l*m)) >= ((h*m)-n):
            res = h*m

        if neg:
            res = res * -1
        print(res)


if __name__ == "__main__":
    main()
