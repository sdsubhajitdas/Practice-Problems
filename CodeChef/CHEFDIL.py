# https://www.codechef.com/AUG19B/problems/CHEFDIL
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    04/08/2019
'''


def flip(arr: list, idx: int):
    left, right = idx-1, idx+1

    if(left >= 0 and arr[left] != None):
        arr[left] = not arr[left]

    if(right < len(arr) and arr[right] != None):
        arr[right] = not arr[right]


def main():
    for _ in range(int(input())):
        arr = [True if i == '1' else False for i in input().strip()]
        remain = len(arr)

        while(True):
            old_remain = remain
            for i in range(len(arr)):
                if(arr[i] == True):
                    arr[i] = None
                    remain -= 1
                    flip(arr, i)

            if(remain == 0 or old_remain == remain):
                break

        print("WIN" if remain == 0 else "LOSE")


if __name__ == "__main__":
    main()
