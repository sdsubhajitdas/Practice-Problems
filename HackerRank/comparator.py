# https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=sorting
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    26/06/2019
'''


def compare(a: tuple, b: tuple) -> int:
    if(a[1] > b[1]):
        return -1
    elif(a[1] < b[1]):
        return 1
    else:
        if(a[0] > b[0]):
            return 1
        elif(a[0] < b[0]):
            return -1
        else:
            return 0


def partition(arr: list, l: int, h: int) -> int:
    i = l - 1
    pivot = arr[h]

    for j in range(l, h):
        if(compare(arr[j], pivot) == -1):
            i += 1
            arr[j], arr[i] = arr[i], arr[j]
    arr[i+1], arr[h] = arr[h], arr[i+1]
    return i+1


def quicksort(arr: list, l: int, h: int):
    if (l < h):
        i = partition(arr, l, h)

        quicksort(arr, l, i-1)
        quicksort(arr, i+1, h)


def main():
    n = int(input())
    arr = list()
    for _ in range(n):
        name, score = input().split(' ')
        score = int(score)
        arr.append((name, score))
    quicksort(arr, 0, n-1)
    for i in arr:
        print(*i)


if __name__ == "__main__":
    main()
