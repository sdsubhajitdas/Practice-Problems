# http://codeforces.com/problemset/problem/110/A
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    DD/MM/2019
'''


def main():
    n = input()
    count = 0
    for digit in n:
        count += 1 if (digit == '4' or digit == '7')else 0

    print('YES' if(count == 7 or count == 4)else 'NO')


if __name__ == "__main__":
    main()
