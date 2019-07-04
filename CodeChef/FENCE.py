# https://www.codechef.com/APRIL19B/problems/FENCE
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    04/07/2019
'''


def main():
    for _ in range(int(input())):
        n, m, k = map(int, input().split())
        plants = dict()
        ans = 0
        while(k != 0):
            r, c = map(int, input().split())
            plants[(r,c)] = True
            ans += 4
            if(plants.get((r+1,c),False)):
                ans -= 2
            if(plants.get((r-1,c),False)):
                ans -= 2
            if(plants.get((r,c+1),False)):
                ans -= 2
            if(plants.get((r,c-1),False)):
                ans -= 2
            k -= 1
        print(ans)


if __name__ == "__main__":
    main()
