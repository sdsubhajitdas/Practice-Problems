# https://www.codechef.com/MARCH19B/problems/SUBPRNJL
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    10/3/2018
    Status: Partial
'''
from math import ceil
from sys import stdin, stdout


def main():
    for _ in range(int(stdin.readline())):
        n, k = map(int, stdin.readline().split())
        arr = list(map(int, stdin.readline().split()))
        count = 0

        for start in range(n):
            sub_array = list()
            freq = [0]*2001
            for end in range(start, n):
                insert_element(sub_array, arr[end])
                freq[arr[end]] += 1

                m = ceil(k/(end - start + 1))
                xk = (k-1)//m
                x = sub_array[xk]
                f = freq[x]
                if f < 2001 and freq[f] > 0:
                    count += 1
        stdout.write(f'{count}\n')


def insert_element(array: list, element: int):
    start, end = 0, len(array) - 1

    while end - start > 0:
        mid = (start + end)//2
        if array[mid] > element:
            end = mid
        else:
            start = mid+1

    if len(array) > start and array[start] < element:
        start += 1

    array.insert(start, element)


if __name__ == "__main__":
    main()
