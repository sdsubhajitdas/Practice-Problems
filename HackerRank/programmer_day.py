# https://www.hackerrank.com/challenges/day-of-the-programmer/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/06/2019
'''


def main():
    year = int(input())
    if (year == 1918):
        print('26.09.1918')
    elif ((year <= 1917) & (year % 4 == 0)) or ((year > 1918) & (year % 400 == 0 or ((year % 4 == 0) & (year % 100 != 0)))):
        print(f'12.09.{year}')
    else:
        print(f'13.09.{year}')


if __name__ == "__main__":
    main()