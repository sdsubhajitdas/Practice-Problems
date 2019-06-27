# https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=strings
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/06/2019
'''


def main():
    s = input()
    freq = dict().fromkeys(s, 0)
    for ch in s:
        freq[ch] += 1

    remove = flag = True

    keys = list(freq.keys())
    i = 1
    j = 0
    while(i < len(keys)):
        if(freq[keys[i]] == freq[keys[j]]):
            j = i
        elif(((abs(freq[keys[i]]-freq[keys[j]]) == 1) or (freq[keys[i]]==1)) and remove):
            remove = False
        else:
            flag = False
            break
        i += 1

    print('YES' if flag else 'NO')


if __name__ == "__main__":
    main()
