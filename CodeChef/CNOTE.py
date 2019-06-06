# https://www.codechef.com/problems/CNOTE
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    07/06/2019
'''


def main():
    for _ in range(int(input())):
        x, y, k, n = map(int, input().split())
        array = list()
        max_page = 0
        min_budget = 2**31
        for _ in range(n):
            p, c = list(map(int,input().strip().split()))
            max_page = max(max_page,p)
            min_budget = min(min_budget,c)
            array.append([p,c])
        
        if (max_page<(x-y) or min_budget>k):
            print('UnluckyChef')
            continue

        array.sort(key= lambda x: x[0])
        flag = False
        for page, cost  in array:
            if cost <= k and page >= (x-y):
                flag = True
                break

        print('LuckyChef' if flag else 'UnluckyChef')
        


if __name__ == "__main__":
    main()
