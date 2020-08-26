# https://codeforces.com/contest/32/problem/B
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/08/2020
'''


def main():
    code = input().strip()
    _len = len(code)
    if(code == '.'):
        print("0")
        return
    number = ""

    idx = 0
    while(idx < _len):
        if(code[idx] == "."):
            number += "0"
        else:
            idx+=1
            number += "1" if(code[idx]==".") else "2"
        idx+=1
    print(number)


if __name__ == "__main__":
    main()
