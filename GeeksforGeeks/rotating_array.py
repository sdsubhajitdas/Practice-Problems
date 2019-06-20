# https://practice.geeksforgeeks.org/problems/reversal-algorithm/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        array = list(map(int, input().strip().split()))
        d = int(input())
        d = d % n
        array = array[d:]+ array[:d]
        print(*array)


if __name__ == "__main__":
    main()
