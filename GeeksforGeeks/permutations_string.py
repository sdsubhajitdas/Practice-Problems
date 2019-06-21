# https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0/?track=sp-recursion&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/06/2019
'''


def print_permutation(arr: list, l: int, r: int, res: list):
    if (l == r):
        res.append(''.join(arr))
        return
    for i in range(l, r+1):
        arr[i], arr[l] = arr[l], arr[i]
        print_permutation(arr, l+1, r, res)
        arr[l], arr[i] = arr[i], arr[l]


def main():
    for _ in range(int(input())):
        arr = list(input().strip())
        res = list()
        print_permutation(arr, 0, len(arr)-1, res)
        res.sort()
        print(*res)


if __name__ == "__main__":
    main()
