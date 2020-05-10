# https://codeforces.com/contest/1352/problem/B
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    10/05/2020
'''

def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())

        nOdd = n-k+1
        if(nOdd>0 and nOdd % 2 == 1):
            print("YES")
            print("1 "*(k-1),nOdd,sep="")
            continue
        
        nEven = n-2*(k-1)
        if(nEven>0 and nEven % 2 == 0):
            print("YES")
            print("2 "*(k-1),nEven,sep="")
            continue
        
        print("NO")

if __name__ == "__main__":
    main()