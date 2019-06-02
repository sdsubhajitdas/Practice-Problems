# https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number/0
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/06/2019
'''
# Solution is O(n) and space complexity is O(1) sort of

def split_by_sign(arr):
    # to the left of the array
    # j records the number of the positive ints
    j = 0
    for i in range(len(arr)):
        if arr[i] > 0:
            arr[i], arr[j] = arr[j], arr[i]
            j += 1
    return j


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = input().split()
        for i in range(n):
            arr[i] = int(arr[i])
        positive_size = split_by_sign(arr)
        # default missing integer to size + 1
        missing = positive_size + 1

        # iterate through all positive ints
        for i in range(positive_size):
            # use elements as array indexes and make each
            # element of that index to negative if it is positive
            # **subtract 1 from the index because array starts
            #  from 0 and the integers start from 0
            # Example:
            #  array : [1, 3, 6, 4, 8]
            #  when i is 0, arr[0] is 1
            #  offset it by -1, and use the result(0) as
            #  new index to set arr[0], which is 1 to -1
            #  when i is 1, arr[1] is 3
            #  offset it by -1, and use tht result(2) as
            #  new index to set arr[2], which is 6 to -6
            if (abs(arr[i]) - 1 < positive_size) and (arr[abs(arr[i]) - 1] > 0):
                arr[abs(arr[i]) - 1] *= -1

        # go through the array again to find the first positive
        # integer, the index of that integer is the missing number
        for i in range(positive_size):
            if arr[i] > 0:
                # add 1 to the index because the array starts at 0
                missing = i + 1
                break
        print(missing)


if __name__ == "__main__":
    main()
