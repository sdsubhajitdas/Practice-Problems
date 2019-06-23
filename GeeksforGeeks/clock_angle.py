'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    DD/MM/2019
'''


def main():
    for _ in range(int(input())):
        h, m = map(float, input().split())
        a = abs((30*h) - ((11/2)*m))
        a = int(min(a, 360 - a))
        print(a)


if __name__ == "__main__":
    main()
