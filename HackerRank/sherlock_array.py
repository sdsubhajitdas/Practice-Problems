# Problem Link
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    DD/MM/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        array = list(map(int, input().strip().split()))

        left_sum = 0
        right_sum = sum(array[1:])
        flag = False

        for index in range(0, n):
            if left_sum == right_sum:
                flag = True
                break
            else:
                left_sum += array[index]
                if index != n-1:
                    right_sum -= array[index + 1]
        
        print('YES' if flag else 'NO')


if __name__ == "__main__":
    main()
