# https://www.hackerrank.com/challenges/absolute-permutation/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/08/2019
'''


def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        num = [0]*(n+1)
        plus = True
        flag = False
        i = 1

        if(k == 0):
            print(*list(range(1,n+1)))
            continue
        while(i <= n):
            j = 0
            while(i <= n and j < k):
                num[i] = i+k if plus else i-k
                if(num[i] <= 0 or num[i] > n):
                    flag = True
                    break
                i += 1
                j += 1
            plus = not plus
            if(flag):
                break
        if(flag):
            print(-1)
        else:
            print(*num[1:])


if __name__ == "__main__":
    main()
