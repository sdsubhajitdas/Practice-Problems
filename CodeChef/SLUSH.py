# https://www.codechef.com/COOK107B/problems/SLUSH
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    24/06/2019
'''


def main():
    for _ in range(int(input())):
        peps, flav = map(int, input().split())

        stock = list(map(int, input().strip().split()))
        stock.insert(0, -1000000)

        order = list()
        profit = 0

        for _ in range(peps):
            flavor, extra, cost = map(int, input().split())
            if(stock[flavor] != 0):
                profit += extra
                stock[flavor] -= 1
                order.append(flavor)
            else:
                profit += cost
                order.append(0)

        rest = list()
        for i in range(flav):
            if(stock[i+1] != 0):
                rest.append([i+1, stock[i+1]])

        i = 0
        for j in range(peps):
            if (order[j] == 0):
                if(rest[i][1] != 0):
                    order[j] = rest[i][0]
                    rest[i][1] -= 1
                else:
                    i += 1
                    order[j] = rest[i][0]
                    rest[i][1] -= 1

        print(profit)
        print(*order)


if __name__ == "__main__":
    main()
