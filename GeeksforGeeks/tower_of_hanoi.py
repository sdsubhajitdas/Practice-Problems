# https://practice.geeksforgeeks.org/problems/tower-of-hanoi/0/?track=PC-W1-R&batchId=131
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    09/06/2019
'''


def tower_of_hanoi(n: int, fro: int, to: int, aux: int) -> int:
    if (n == 1):
        print(f'move disk {n} from rod {fro} to rod {to}')
        return 1
    count = tower_of_hanoi(n-1, fro, aux, to)
    print(f'move disk {n} from rod {fro} to rod {to}')
    return tower_of_hanoi(n-1, aux, to, fro) + count + 1


def main():
    for _ in range(int(input())):
        n = int(input())
        count = tower_of_hanoi(n, 1, 3, 2)
        print(count)


if __name__ == "__main__":
    main()
