# https://www.hackerrank.com/challenges/special-palindrome-again/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=strings
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/06/2019
'''


def main():
    n = int(input())
    s = input()
    total = 0
    count_seq = 0
    prev = ''
    for i, ch in enumerate(s):
        count_seq += 1
        if(i != 0 and ch != prev):
            j = 1
            while(i-j >= 0 and i+j < n and j <= count_seq):
                if(s[i+j] == prev == s[i-j]):
                    j+=1
                    total += 1
                else:
                    break
            count_seq = 1
        total += count_seq
        prev = ch

    print(total)


if __name__ == "__main__":
    main()
