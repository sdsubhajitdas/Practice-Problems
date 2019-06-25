# https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes/0/?track=sp-mathematics&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    24/06/2019
'''


def main():
    t = int(input())
    n = list()
    for _ in range(t):
        n.append(int(input()))
    limit = max(n)
    mem = [True]*(limit+1)
    mem[0], mem[1] = False, False

    i = 2
    while(i*i<=limit):
        if(mem[i]==True):
            for j in range(i*i,limit+1,i):
                mem[j] = False
        i += 1
    
    for i in n:
        for j in range(2,i+1):
            if(mem[j]==True):
                print(j,end=' ')
        print()

if __name__ == "__main__":
    main()
