# https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    DD/MM/2019
'''


def print_comb(a: list, i: int, word: str):
    if (len(a) == len(word)):
        print(word,end=' ')
        return
    for ch in kpad[a[i]]:
        print_comb(a, i+1, word+ch)

def main():
    for _ in range(int(input())):
        n = int(input())
        key = list(map(int, input().strip().split()))
        global kpad
        kpad = {2: 'abc',
                3: 'def',
                4: 'ghi',
                5: 'jkl',
                6: 'mno',
                7: 'pqrs',
                8: 'tuv',
                9: 'wxyz'}

        print_comb(key, 0, '')
        print()


if __name__ == "__main__":
    main()
