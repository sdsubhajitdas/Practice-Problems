# https://www.hackerrank.com/challenges/picking-numbers/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/06/2019
'''


def main():
    n = int(input())
    array = list(map(int, input().strip().split()))
    freq = dict().fromkeys(set(array), 0)
    for element in array:
        freq[element] += 1
    max_count = 0
    keys = sorted(list(freq.keys()))

    if (len(keys) == 1):
        print(n)
        return

    for index in range(len(keys)-1):
        if keys[index+1] - keys[index] <= 1:
            s = freq[keys[index]] + freq[keys[index+1]]
            max_count = max(max_count, s)
        else:
            max_count = max(max_count, freq[keys[index]])

    print(max_count)


if __name__ == "__main__":
    main()
