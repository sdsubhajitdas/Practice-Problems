# https://www.codechef.com/AUG19B/problems/ZOMCAV
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    04/08/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        rp = list(map(int, input().strip().split()))
        zom = list(map(int, input().strip().split()))
        flag = True
        caves = [0]*(n+1)

        for i in range(n):
            start = max(i - rp[i], 0)
            end = min(i + rp[i], n-1)
            caves[start] += 1
            caves[end+1] -= 1

        s = 0
        for i in range(n+1):
            x = caves[i]
            caves[i] += s
            s += x
        
        table = dict()

        for i in range(n):
            table[caves[i]] = table.get(caves[i],0) + 1
        
        for z in zom:
            if(table.get(z,False)==False):
                flag = False
                break
            table[z] -= 1

            if(table[z]<0):
                flag = False
                break
        
        print("YES" if flag else "NO")


if __name__ == "__main__":
    main()
