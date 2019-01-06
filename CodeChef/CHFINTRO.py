# https://www.codechef.com/DEC18B/problems/CHFINTRO
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    12/12/2018
'''

def main():
    n,r = list(map(int,input().strip().split()))
    for _ in range(n):
        rating = int(input())
        if rating >= r:
            print("Good boi")
        else:
            print("Bad boi")
    
if __name__ =='__main__':
    main()