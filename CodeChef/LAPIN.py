# https://www.codechef.com/LRNDSA01/problems/LAPIN
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/08/2020
'''


def main():
    for _ in range(int(input())):
        word = input().strip()
        print("YES" if(checkLapalindrome(word)) else "NO")


def checkLapalindrome(word:str) -> bool:
    wordLen = len(word)
    left, right = None, None

    if(wordLen % 2 == 0):
        left = right =  wordLen//2
    else:
        left = wordLen//2
        right = left + 1
    
    table = dict().fromkeys(word[0:left],0)

    for char in word[:left]:
        table[char] += 1
    
    for char in word[right:]:
        if(table.get(char,-1) != -1):
            table[char] -= 1
        else:
            return False

    for key in table.keys():
        if(table[key] != 0):
            return False
    
    return True


if __name__ == "__main__":
    main()
