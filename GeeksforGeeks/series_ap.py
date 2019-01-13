# https://practice.geeksforgeeks.org/problems/series-ap/0/?track=interview-mathematical
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	13/1/2019
'''


def main():
    for _ in range(int(input())):
        a , b = map(int,input().strip().split())
        n = int(input())
        n = a + (n-1)*(b-a)
        print(n)


if __name__ == "__main__":
    main()
