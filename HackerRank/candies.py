# https://www.hackerrank.com/challenges/candies/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    24/06/2019
'''


def main():
    n = int(input())
    arr = list()
    for _ in range(n):
        arr.append(int(input()))
    lr = [0]*n
    rl = lr[::]
    lr[0] = 1

    for i in range(1, n):
        if(arr[i] > arr[i-1]):
            lr[i] = lr[i-1] + 1
        else:
            lr[i] = 1

    rl[-1] = 1
    s = lr[-1]
    for i in range(n-2, -1, -1):
        if(arr[i] > arr[i+1]):
            rl[i] = rl[i+1] + 1
        else:
            rl[i] = 1
        s += lr[i] if(lr[i] > rl[i]) else rl[i]

    print(s)


if __name__ == '__main__':
    main()
