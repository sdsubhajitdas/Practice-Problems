# https://www.codechef.com/JAN19B/problems/FANCY
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    6/1/2019
'''

def main():
    for _ in range(int(input())):
        s = input().strip().split(' ')
        if 'not' in s:
            print('Real Fancy')
        else:
            print('regularly fancy')



if __name__ == "__main__":
    main()