# https://www.hackerrank.com/challenges/two-strings/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    18/06/2019
'''

def main():
    for _ in range(int(input())):
        s1 = input().strip()
        s2 = input().strip()
        table = dict().fromkeys(list(s2),True)
    
        for ch in s1:
            if (table.get(ch,False)==True):
                print('YES')
                break
        else:
            print('NO')
    
if __name__ == "__main__":
    main()