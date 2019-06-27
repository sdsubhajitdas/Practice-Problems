# https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=strings
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/06/2019
'''


def main():
    for _ in range(int(input())):
        s = input()
        lens = len(s)
        if(lens == 1):
            print(0)
            continue
        new = s[0]
        i = 0

        while(i < lens):
            j = i+1
            while(j < lens and s[j] == s[i]):
                j += 1

            if(j < lens):
                new = new + s[j]
            i = j

        print(lens - len(new))


if __name__ == "__main__":
    main()
