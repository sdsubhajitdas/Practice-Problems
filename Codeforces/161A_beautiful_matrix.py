# https://codeforces.com/contest/263/problem/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/08/2020
'''

def main():
    r,c = 0,0
    for _ in range(5):
        arr = list(map(int,input().strip().split()))
        if(arr.count(1)!=0):
            r = _+1
            c = arr.index(1) + 1
    
    print(abs(r-3)+abs(c-3))
    
    

if __name__ == "__main__":
    main()