# https://www.codechef.com/COOK107B/problems/EATTWICE
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    23/06/2019
'''


def main():
    for _ in range(int(input())):
        n, m = map(int, input().split())
        arr = list()
        for _ in range(n):
            day, taste = map(int, input().split())
            arr.append([day, taste])

        arr.sort(key=lambda x: x[1], reverse=True)
        prev_day, count, total = 0, 0, 0
        for i in range(n):
            if(count == 2):
                break
            if(arr[i][0] != prev_day):
                total += arr[i][1]
                count += 1
                prev_day = arr[i][0]

        print(total)


if __name__ == "__main__":
    main()
