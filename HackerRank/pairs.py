# https://www.hackerrank.com/challenges/pairs/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=search
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/07/2019
'''


def main():
    n, k = map(int, input().split())
    arr = list(map(int, input().strip().split()))
    table = dict()

    count = 0
    for ai in arr:
        if(table.get(ai+k, False)):
            count += 1
        if(table.get(ai-k, False)):
            count += 1
        table[ai] = True

    print(count)


if __name__ == "__main__":
    main()
