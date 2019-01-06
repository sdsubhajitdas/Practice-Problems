# https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/k-priority-interview-d3447f63/
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    6/1/2019
'''


def main():
    n = int(input())
    male, female = [], []
    for _ in range(n):
        pair = tuple(map(int, input().strip().split()))
        if pair[0] == 0:
            female.append(pair[1])
        else:
            male.append(pair[1])

    male.sort(reverse=True)
    female.sort(reverse=True)

    print(*female, end=' ')
    print(*male)


if __name__ == "__main__":
    main()
