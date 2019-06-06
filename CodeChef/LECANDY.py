# https://www.codechef.com/problems/LECANDY
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    07/06/2019
'''


def main():
    for _ in range(int(input())):
        n, c = map(int, input().split())
        array = list(map(int, input().strip().split()))
        print("Yes" if sum(array)<= c else "No")


if __name__ == "__main__":
    main()
