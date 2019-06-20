# https://practice.geeksforgeeks.org/problems/pythagorean-triplet/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        array = list(map(int, input().strip().split()))
        array = [i*i for i in array]
        table = dict().fromkeys(array, True)
        flag = False
        for idx, i in enumerate(array):
            for j in array[idx+1:]:
                if (table.get(i+j, False)):
                    flag = True
                    break
        print('Yes' if flag else 'No')


if __name__ == "__main__":
    main()
