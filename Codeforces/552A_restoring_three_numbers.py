# https://codeforces.com/contest/1154/problem/A
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    17/4/2019
'''


def main():
    array = list(map(int, input().split()))
    abc = max(array)
    array.remove(abc)
    ab, ac, bc = array

    a = abc - bc
    b = abc - ac
    c = abc - ab

    print(a,b,c)


if __name__ == '__main__':
    main()
