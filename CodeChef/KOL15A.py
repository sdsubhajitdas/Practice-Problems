# https://www.codechef.com/problems/KOL15A
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	6/1/2018
'''


def main():
    for _ in range(int(input())):
        s = input()
        su =0
        for i in s:
            if i>='1' and i<='9':
                su += int(i)
        print(su)


if __name__ == "__main__":
    main()
