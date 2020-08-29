# https://codeforces.com/contest/59/problem/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/08/2020
'''

def main():
    word = input().strip()
    upper = lower = 0

    for char in word:
        if(char>='a' and char <= 'z'):
            lower += 1
        if(char>='A' and char <= 'Z'):
            upper += 1
    
    print(word.lower() if(lower>=upper) else word.upper())

if __name__ == "__main__":
    main()