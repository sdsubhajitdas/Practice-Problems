# https://www.codechef.com/AUG19B/problems/DSTAPLS
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    04/08/2019
'''

def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        print("NO" if((k==1)or((n//k)%k==0)) else "YES")

if __name__ == "__main__":
    main()