# https://www.codechef.com/JAN19B/problems/HP18
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	6/1/2018
'''


def counts(array, a, b):
    both, bob, alice = 0, 0, 0
    for i in array:
        if i % a == 0 and i % b == 0:
            both += 1
        elif i % a == 0:
            bob += 1
        elif i % b == 0:
            alice += 1
    return both, bob, alice


def main():
    for _ in range(int(input())):
        n, a, b = list(map(int, input().strip().split()))
        array = list(map(int, input().strip().split()))

        both, bob, alice = counts(array, a, b)

        print('BOB') if bob > alice - (both > 0) else print('ALICE')


if __name__ == "__main__":
    main()
