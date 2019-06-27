# https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=strings
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/06/2019
'''

def main():
    a = input()
    b = input()
    freq = dict().fromkeys(a,0)

    for ch in a:
        freq[ch] += 1

    count = 0
    for ch in b:
        if(freq.get(ch,False)==False):
            count += 1
        else:
            freq[ch] -= 1
    
    for key in freq.keys():
        count += abs(freq[key])
    
    print(count)


if __name__ == "__main__":
    main()