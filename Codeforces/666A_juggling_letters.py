# https://codeforces.com/contest/1397/problem/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/08/2020
'''


def main():
    words = list()
    for _ in range(int(input())):
        words.append(input().strip().lower())

    table = [0]*26
    for word in words:
        for char in word:
            table[ord(char)-ord('a')] += 1
            

    for charCount in table:
        if(charCount % len(words) != 0):
            print("NO")
            return

    print("YES")


if __name__ == "__main__":
    for _ in range(int(input())):
        main()
    # main()
