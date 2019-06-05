# https://www.hackerrank.com/challenges/beautiful-pairs/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    05/06/2019
'''


def main():
    n = int(input())
    a = list(map(int, input().strip().split()))
    b = list(map(int, input().strip().split()))

    freq_dict = dict()

    for ai in a:
        if freq_dict.get(ai, -1) == -1:
            freq_dict[ai] = 1
        else:
            freq_dict[ai] += 1

    same = True
    count = 0
    for bi in b:
        if freq_dict.get(bi, -1) != -1:
            if (freq_dict[bi] >= 1):
                count += 1
                freq_dict[bi] -= 1
            else:
                same = False
        else:
            same= False

    if count == n:
        count -= 1

    count += 0 if same else 1
    print(count)


if __name__ == "__main__":
    main()
