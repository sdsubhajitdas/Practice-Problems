# https://www.codechef.com/problems/NUM239
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	6/1/2018
'''


def main():
    for _ in range(int(input())):
        l, r = list(map(int, input().strip().split()))

        start = l//10
        end = r//10
        count = 0
        for i in range(start, end+1):
            i2 = i*10 + 2
            i3 = i*10 + 3
            i9 = i*10 + 9

            if i2 >= l and i2 <= r:
                count += 1
            if i3 >= l and i3 <= r:
                count += 1
            if i9 >= l and i9 <= r:
                count += 1

        print(count)


if __name__ == "__main__":
    main()
