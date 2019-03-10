# https://www.codechef.com/UEMCO19/problems/UEM1901
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	10/3/2019
'''


def remove_digit(n, d):
    n = list(str(n))
    d = str(d)
    if d in n:
        while n.count(d) != 0:
            n.remove(d)
    return int(''.join(n))


def main():
    for _ in range(int(input())):
        a, b, d = map(int, input().split())

        apb = a + b

        new_a = remove_digit(a, d)
        new_b = remove_digit(b, d)
        new_apb = new_a + new_b

        if new_apb == remove_digit(apb, d):
            print('Go ahead')
        else:
            print('Try again')


if __name__ == "__main__":
    main()
