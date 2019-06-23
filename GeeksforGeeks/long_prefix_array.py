# https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    23/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = input().strip().split()
        arr.sort(key=lambda x: len(x))
        prefix = ''
        for i,ch in enumerate(arr[0]):
            flag = True
            for word in arr[1:]:
                if (word[i] != ch):
                    flag = False
                    break
            if flag:
                prefix += ch
            else:
                break

        print(prefix if prefix != '' else -1)

if __name__ == "__main__":
    main()
