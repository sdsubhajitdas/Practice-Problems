# https://codeforces.com/contest/1352/problem/C
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    10/05/2020
'''
import math

def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        print(k+(math.floor((k-1)/(n-1))))
    
    
if __name__ == "__main__":
    main()