# https://www.codechef.com/LTIME65B/problems/THREEFR
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    27/10/2018
'''


def main():
    for _ in range(int(input())):
        global x, y, z
        x, y, z = list(map(int, input().strip().split()))

        global a
        a = 10 ** 6
        if decide(a, 0) == 1:
            print('yes')
        else:
            print('no')


def decide(root, starting):

    if starting == 0:
        return max(decide(root-z, 1), decide(root+z, 1))

    if starting == 1:
        return max(decide(root-y, 2), decide(root+y, 2))

    if starting == 2:
        return max(decide(root-x, 3), decide(root+x, 3))

    if root == a and starting == 3:
        return 1
    else:
        return 0


if __name__ == '__main__':
    main()
