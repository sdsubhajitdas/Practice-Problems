# http://codeforces.com/contest/1191/problem/0
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    12/07/2019
'''


def main():
    n = int(input())
    rem = n % 4

    if(rem == 1):
        print('0 A')
    elif(rem == 3):
        print('2 A')
    elif(rem == 2):
        print('1 B')
    elif(rem == 0):
        print('1 A')


if __name__ == "__main__":
    main()
