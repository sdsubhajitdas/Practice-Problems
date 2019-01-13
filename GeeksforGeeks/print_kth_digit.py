# https://practice.geeksforgeeks.org/problems/print-the-kth-digit/0/?track=interview-mathematical
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	13/1/2019
'''


def main():
    for _ in range(int(input())):
        a, b, k = map(int, input().strip().split())
        n = str(pow(a,b))
        print(n[len(n)-k])


if __name__ == "__main__":
    main()
