# https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    05/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        div = (n//5)*5
        while((n-div) % 3 != 0 and div >= 0):
            div -= 5
        if div < 0:
            print('-1')
        else:
            if n % 5 == 0 and n % 3 == 0:
                print('5'*n)
                continue
            div = div % 15
            n = n-div
            print(f"{'5'*n}{'3'*div}")


if __name__ == "__main__":
    main()
