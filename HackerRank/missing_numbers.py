# https://www.hackerrank.com/challenges/missing-numbers/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    05/06/2019
'''


def main():
    n = int(input())
    missing = list(map(int, input().strip().split()))
    m = int(input())
    array = list(map(int, input().strip().split()))

    miss_dict = dict().fromkeys(array, 0)
    arr_dict = dict().fromkeys(array, 0)

    for i in array:
        arr_dict[i] += 1
    for i in missing:
        miss_dict[i] += 1

    keys = sorted(list(arr_dict.keys()))

    for key in keys:
        if arr_dict[key] != miss_dict[key]:
            print(key, end=' ')
    print()


if __name__ == "__main__":
    main()
