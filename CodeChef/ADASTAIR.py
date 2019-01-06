# https://www.codechef.com/COOK99B/problems/ADASTAIR
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    21/10/2018
'''


def main():
    for _ in range(int(input())):
        n, k = tuple(map(int, input().strip().split()))
        h = list(map(int, input().strip().split()))
        old_len = len(h)
        added = True

        reached = 0
        hi = 0
        while added:
            added = False
            for i in range(reached, len(h)):
                hf = h[i]
                if hf - hi > k:
                    added = True
                    h.insert(i, hi+k)
                    reached = i
                    break
                hi = hf

        print(len(h)-old_len)


if __name__ == '__main__':
    main()
