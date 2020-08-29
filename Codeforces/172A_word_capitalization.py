# https://codeforces.com/contest/281/problem/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    DD/MM/2020
'''

def main():
    word = list(input().strip())
    if(not word[0].isupper()):
        word[0] = word[0].upper()
    print("".join(word))



if __name__ == "__main__":
    main()