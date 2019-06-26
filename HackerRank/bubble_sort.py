# https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=sorting
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    26/06/2019
'''


def main():
    n = int(input())
    arr = list(map(int, input().strip().split()))

    i = j = 0
    swaps = 0
    for i in range(n):
        for j in range(n-i-1):
            if (arr[j] > arr[j+1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swaps += 1

    print('Array is sorted in',swaps,'swaps.')
    print('First Element:',arr[0])
    print('Last Element:',arr[-1])


if __name__ == "__main__":
    main()
