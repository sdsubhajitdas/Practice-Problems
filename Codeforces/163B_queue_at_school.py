# https://codeforces.com/contest/266/problem/B
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/08/2020
'''


def main():
    n, k = map(int, input().strip().split())
    queue = list(input().strip())

    while(k != 0):
        k -= 1
        idx = 0
        while(idx < n-1):
            if(queue[idx]=='B' and queue[idx+1]=="G"):
                queue[idx], queue[idx+1] = "G", "B"
                idx+=1
            idx+=1
    print("".join(queue))


if __name__ == "__main__":
    main()
