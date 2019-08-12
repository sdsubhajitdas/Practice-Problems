# https://www.codechef.com/AUG19B/problems/KS1
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    7/08/2019
'''
from collections import defaultdict

def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        arr.insert(0,0)
        x = [0]*(n+1)
        s = 0

        p = defaultdict(list)

        for i in range(1,n+1):
            x[i] = x[i-1] ^ arr[i]
        
        for i in range(n+1):
            sz = 0 if(p.get(x[i],None) == None) else len(p[x[i]])
            if(sz>0):
                s += ((sz*(i-1))-p[x[i]][-1])
                p[x[i]].append(i+p[x[i]][-1])
            else:
                p[x[i]].append(i)
        
        print(s)


if __name__ == "__main__":
    main()
