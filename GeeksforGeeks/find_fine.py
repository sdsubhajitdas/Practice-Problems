# https://practice.geeksforgeeks.org/problems/find-the-fine/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/06/2019
'''


def main():
    for _ in range(int(input())):
        n, d = map(int, input().split())
        cars = list(map(int, input().strip().split()))
        fines = list(map(int, input().strip().split()))

        oe = d & 1
        total = 0
        for car, fine in zip(cars, fines):
            if (car & 1 != oe):
                total += fine

        print(total)


if __name__ == "__main__":
    main()
