# https://www.hackerrank.com/challenges/between-two-sets/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/06/2019
'''


def gcd(a: int, b: int)->int:
    a, b = max(a, b), min(a, b)
    while (b):
        a, b = b, a % b
    return a


def lcm(a: int, b: int)-> int:
    return (a*b) // gcd(a, b)


def main():
    n, m = map(int, input().strip().split())
    a = list(map(int, input().strip().split()))
    b = list(map(int, input().strip().split()))

    lcm_a, gcd_b = a[0], b[0]

    for a_ele in a[1:]:
        lcm_a = lcm(lcm_a,a_ele)
    
    for b_ele in b[1:]:
        gcd_b = gcd(gcd_b,b_ele)
        
    count =  0
    for multiple in range(lcm_a,gcd_b+1,lcm_a):
        if (gcd_b% multiple == 0):
            count+=1
    
    print(count)


if __name__ == "__main__":
    main()
