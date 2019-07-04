# https://www.codechef.com/APRIL19B/problems/STRCH
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    03/07/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        word, char = input().split()
        count = n * (n+1) // 2
        pos = [-1]
        for idx, ch in enumerate(word):
            if(ch == char):
                pos.append(idx)
        pos.append(n)

        for i in range(1, len(pos)):
            ln = pos[i] - pos[i-1] - 1
            count -= (ln*(ln+1)//2)

        print(count)


if __name__ == "__main__":
    main()
