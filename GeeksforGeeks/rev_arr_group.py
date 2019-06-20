# https://practice.geeksforgeeks.org/problems/reverse-array-in-groups/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/06/2019
'''


def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        array = list(map(int, input().strip().split()))

        for idx in range(0, n, k):
            end = min(idx+k, n)
            array = array[0:idx]+array[idx:end][::-1]+array[end:]
        print(*array)


if __name__ == "__main__":
    main()
