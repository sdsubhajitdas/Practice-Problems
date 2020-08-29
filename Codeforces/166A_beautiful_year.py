# https://codeforces.com/contest/271/problem/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/08/2020
'''

def main():
    year =  int(input().strip())+1
    count = len(set(list(str(year))))

    while(count!=4):
        year = int(year)+1
        count = len(set(list(str(year))))
    print(year)


if __name__ == "__main__":
    main()