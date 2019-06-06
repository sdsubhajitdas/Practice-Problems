# https://www.hackerrank.com/challenges/largest-permutation/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    06/06/2019
'''


def main():
    n, k = map(int, input().split())
    array = list(map(int, input().strip().split()))
    index = [0]*(n+1)
    for i in range(n):
        index[array[i]] = i

    for i in range(n):
        if k == 0:
            break
        elif (array[i] == n-i):
            continue
        else:
            ind = index[n-i]
            array[i], array[ind] = array[ind], array[i]
            index[array[i]], index[array[ind]
                                   ] = index[array[ind]], index[array[i]]
        k -= 1
    
    print(*array)


if __name__ == "__main__":
    main()
