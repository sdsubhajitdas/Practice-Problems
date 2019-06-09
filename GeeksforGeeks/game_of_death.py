# https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle/0/?track=PC-W1-R&batchId=131
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    09/06/2019
'''
import sys
sys.setrecursionlimit(2000)


def game(array: list, k: int) -> int:
    remove = (k % len(array)) - 1
    array[remove] = None
    if (len(array) == 2):
        array.remove(None)
        return array[0]
    array = array[remove+1:]+array[0:remove]
    return game(array, k)


def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        array = list(range(1, n+1))
        survivor = game(array, k)
        print(survivor)


if __name__ == "__main__":
    main()
