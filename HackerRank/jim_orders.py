# https://www.hackerrank.com/challenges/jim-and-the-orders/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    06/06/2019
'''


def main():
    n = int(input())
    table = list()
    serve = list()
    for _ in range(n):
        order, prep = map(int, input().split())
        table.append([_+1, order, prep, order+prep])
        serve.append(order+prep)
    table.sort(key=lambda x: x[3])
    serve.sort()

    i = 0
    while i < n:
        out = serve.count(table[i][3])
        temp = table[i:out+i]
        if len(temp) == 1:
            print(temp[0][0], end=' ')
        else:
            temp.sort(key=lambda x: x[0])
            for x in temp:
                print(x[0], end=' ')
        i += out
    print()


if __name__ == "__main__":
    main()
