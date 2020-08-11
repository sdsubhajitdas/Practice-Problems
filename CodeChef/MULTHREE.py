# https://www.codechef.com/LRNDSA01/problems/MULTHREE
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/08/2020
'''


def main():
    for _ in range(int(input())):
        k, d0, d1 = map(int, input().split())

        temp = d0+d1
        _sum = (2*temp) % 10 + (4*temp) % 10 + (8*temp) % 10 + (6*temp) % 10
        result = d0+d1

        k -= 2
        if(k > 0):
            result += temp % 10
            k -= 1

        result += (k//4)*_sum
        k %= 4

        p = 2
        while(k != 0):
            result += (p*temp) % 10
            p = (p*2) % 10
            k -= 1

        print("YES" if(result % 3 == 0) else "NO")


if __name__ == "__main__":
    main()
