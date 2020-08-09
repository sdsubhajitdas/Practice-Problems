# https://www.codechef.com/LRNDSA01/problems/FCTRL
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/08/2020
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        multiple = 5
        count = 0

        while(n>= multiple):
            count += n // multiple
            multiple *= 5
        
        print(count)


if __name__ == "__main__":
    main()
