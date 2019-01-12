# https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array/0
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	12/1/2019
'''


def binary_search(arr, low, high):
    if low == high:
        return arr[low]

    if high == low+1:
        return max(arr[low], arr[high])

    mid = (high + low) // 2
    if arr[mid] >= arr[mid-1] and arr[mid] > arr[mid+1]:
        return arr[mid]
    elif arr[mid] > arr[mid-1] and arr[mid] >= arr[mid+1]:
        return arr[mid]

    if arr[mid] < arr[mid-1] and arr[mid] > arr[mid+1]:
        return binary_search(arr, low, mid-1)
    elif arr[mid] > arr[mid-1] and arr[mid] < arr[mid+1]:
        return binary_search(arr, mid+1, high)


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        number = binary_search(arr, 0, n-1)
        print(number)


if __name__ == "__main__":
    main()
