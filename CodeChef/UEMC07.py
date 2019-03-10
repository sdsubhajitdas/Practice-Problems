# https://www.codechef.com/UEMCO19/problems/UEMC07
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	10/3/2019
'''

def main():
    n = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    modulo = 1000000007

    while len(arr) > 1:
        max1 = arr[-1]
        arr.pop()
        max2 = arr[-1]
        arr.pop()

        add = (max1*max2)%modulo
        arr.append(add)
    
    for i in arr:
        print(i,end='')


if __name__ == "__main__":
    main()