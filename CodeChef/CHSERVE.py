# https://www.codechef.com/OCT18B/problems/CHSERVE
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    8/10/2018
'''


def main():
    tc = int(input())
    for _ in range(tc):
        p1, p2, k = list(map(int, input().strip().split()))
        chance = int((p1+p2)/k)
        if chance % 2 == 0:
            print('CHEF')
        else:
            print('COOK')


if __name__ == '__main__':
    main()
