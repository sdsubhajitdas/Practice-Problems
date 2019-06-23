# https://www.codechef.com/COOK107B/problems/EXAM1
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    23/06/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        ans = list(input().strip())
        mark = list(input().strip())
        tot = i = 0
        while(i < n):
            if(mark[i] == 'N'):
                i += 1
                continue

            if(mark[i] == ans[i]):
                tot += 1
                i += 1
            else:
                i += 2
        print(tot)


if __name__ == "__main__":
    main()
