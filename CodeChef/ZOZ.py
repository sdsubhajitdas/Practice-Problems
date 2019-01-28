# https://www.codechef.com/problems/ZOZ
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	28/1/2018
'''


def main():
    for _ in range(int(input())):
        n, k = map(int, input().strip().split())
        arr = list(map(int, input().split()))
        arr.sort(reverse=True)
        arr_sum = sum(arr)
        count = 0
        for i in arr:
            check_sum = arr_sum-i
            if i+k > check_sum:
                count += 1
            else:
                break

        print(count)


if __name__ == "__main__":
    main()
