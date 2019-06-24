# https://www.codechef.com/COOK107B/problems/ANTEATER
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    24/06/2019
'''


def main():
    for _ in range(int(input())):
        r, c = map(int, input().split())
        g = list()
        ants = list()
        eaters = set()
        dd = {'U': (-1, 0), 'D': (1, 0), "L": (0, -1), "R": (0, 1)}

        for i in range(r):
            g.append(list(input().strip()))
            for j in range(c):
                if(g[i][j] in 'UDLR'):
                    ants.append((i, j, dd[g[i][j]]))
                elif(g[i][j] == '#'):
                    eaters.add((i, j))

        count = 0
        while(len(ants) != 0):
            nants = list()
            nc = dict()
            for k in ants:
                nk = (k[0]+k[2][0], k[1]+k[2][1])
                if(nk not in eaters and min(nk) >= 0 and nk[0] < r and nk[1] < c):
                    nants.append((nk[0], nk[1], k[2]))
                    if(nk not in nc):
                        nc[nk] = 1
                    else:
                        nc[nk] += 1
            ants = nants
            for i, k in nc.items():
                count+= (k*(k-1))//2
        print(count)


if __name__ == "__main__":
    main()
