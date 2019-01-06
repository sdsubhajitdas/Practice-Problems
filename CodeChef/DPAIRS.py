# https://www.codechef.com/JAN19B/problems/DPAIRS
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    6/1/2019
    Status - Partial
'''


def main():
    n, m = list(map(int, input().strip().split()))
    a = list(map(int, input().strip().split()))
    b = list(map(int, input().strip().split()))

    track = dict()
    count = 0
    broken = False

    for i, ai in enumerate(a):
        for j, bj in enumerate(b):
            # Terminate when N+M-1 elements are found
            if count == (n+m-1):
                broken = True
                break
            s = ai + bj
            if s not in track.keys():
                track[s] = (i, j)
                count += 1

        if broken:
            break

    for key in track.keys():
        res = track[key]
        print(res[0], res[1])


if __name__ == "__main__":
    main()
