# https://practice.geeksforgeeks.org/problems/the-painters-partition-problem/0/?track=dp-divide-and-conquer&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/07/2019
'''

import sys


def painters_needed(boards: list, time: int):
    count = 0
    temps = 0
    for board in boards:
        if(temps+board <= time):
            temps += board
        else:
            count += 1
            temps = board

    return count + 1


def main():
    for _ in range(int(input())):
        painters, n = map(int, input().split())
        boards = list(map(int, input().strip().split()))

        low, high = max(boards), sum(boards)
        ans = sys.maxsize

        while(low <= high):
            mid = (low+high)//2
            needed = painters_needed(boards, mid)

            if(needed > painters):
                low = mid+1
            else:
                ans = min(mid, ans)
                high = mid-1

        print(ans)


if __name__ == "__main__":
    main()
