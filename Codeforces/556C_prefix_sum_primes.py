# http://codeforces.com/contest/1150/problem/C
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/4/2019
'''


def is_odd(number: int):
    return False if number % 2 == 0 else True


def main():
    n = int(input())
    array = input().strip().split(' ')
    ones = array.count('1')
    twos = array.count('2')
    del array
    next_num = 2
    print_str = ""

    while twos != 0 and ones != 0:
        if twos + ones == n:
            print_str += "2 "
            twos -= 1
        else:
            if is_odd(next_num+1):
                print_str += "1 "
                ones -= 1
                next_num += 1
            elif is_odd(next_num+2):
                print_str += "2 "
                twos -= 1
                next_num += 2

    if twos != 0:
        print_str += "2 "*twos
        twos = 0

    if ones != 0:
        print_str += "1 "*ones
        ones = 0

    print(print_str.strip())


if __name__ == '__main__':
    main()
