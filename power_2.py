# https://practice.geeksforgeeks.org/problems/power-of-2/0/?track=sp-mathematics&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    23/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        print('YES' if((n&(n-1)==0) and (n!=0)) else 'NO')


if __name__ == "__main__":
    main()
