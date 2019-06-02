# https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/06/2019
'''

def main():
    n, k = map(int, input().strip().split())
    array = list(map(int, input().strip().split()))

    mod = [0]*k
    count = 0

    for ele in array:
        mod[ele%k]+=1

    count += (mod[0] * (mod[0]-1))//2
    i = 1
    while(i<=k//2 and i != k-i):
        count += mod[i] * mod[k-i]
        i+=1
    
    if (k%2 == 0):
        count+= mod[k//2] * (mod[k//2]-1) // 2

    print(count)


if __name__ == "__main__":
    main()