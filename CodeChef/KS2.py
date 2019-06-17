# https://www.codechef.com/JUNE19B/problems/KS2
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    12/06/2019
'''


def sum_i(i: int)-> int:
    return sum(map(int, str(i)))


def main():
    for _ in range(int(input())):
        n = int(input())
        res = n * 10
        i = res
        while(i <= res + 10):
            if (sum_i(i) % 10 == 0):
                print(i)
                break
            i += 1


if __name__ == "__main__":
    main()
