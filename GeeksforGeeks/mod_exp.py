# https://practice.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers/0/?track=dp-divide-and-conquer&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/07/2019
'''


def mod_exp(a, b, c):
    if(b == 0):
        return 1
    if(b == 1):
        return a
    if(b & 1 == 0):
        y = mod_exp(a, b//2, c) % c
        return (y*y) % c
    else:
        y = mod_exp(a, b-1, c)
        return ((a % c)*(y)) % c


def main():
    for _ in range(int(input())):
        a, b, c = map(int, input().split())
        print(mod_exp(a,b,c)%c)

if __name__ == "__main__":
    main()
