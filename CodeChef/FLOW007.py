# https://www.codechef.com/LRNDSA01/problems/FLOW007
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/08/2020
'''

def main():
    for _ in range(int(input())):
        print(int("".join(reversed(str(int(input()))))))


if __name__ == "__main__":
    main()