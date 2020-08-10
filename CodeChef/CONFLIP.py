# https://www.codechef.com/LRNDSA01/problems/CONFLIP
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/08/2020
'''


def main():
    for _ in range(int(input())):
        for _ in range(int(input())):
            initial, total, guess = map(int, input().split())

            if(initial == guess):
                print(total//2)
            else:
                print((total//2+1) if(total % 2 != 0) else (total//2))


if __name__ == "__main__":
    main()
