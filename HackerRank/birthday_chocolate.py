# https://www.hackerrank.com/challenges/the-birthday-bar/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/06/2019
'''

def main():
    n = int(input())
    array = list(map(int,input().strip().split()))
    d, m = map(int,input().strip().split())
    if m>n:
        print(0)
        return

    window_sum = sum(array[0:m])
    count = 1 if window_sum == d else 0

    for index in range(1,n-m+1):
        window_sum = window_sum - array[index-1] + array[index+m-1]
        count += 1 if window_sum == d else 0
    
    print(count)

if __name__ == "__main__":
    main()