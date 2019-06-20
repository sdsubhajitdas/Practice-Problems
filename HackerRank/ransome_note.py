# https://www.hackerrank.com/challenges/ctci-ransom-note/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    18/06/2019
'''

def main():
    m, n = map(int, input().split())
    mag = input().strip().split()
    note = input().strip().split()

    table = dict().fromkeys(mag, 0)
    for word in mag:
        table[word] += 1

    for word in note:
        if (table.get(word,-1)==-1):
            print('No')
            return
        if (table[word]==0):
            print('No')
            return
        table[word] -= 1
    
    print('Yes')

if __name__ == "__main__":
    main()