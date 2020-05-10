# https://codeforces.com/contest/1352/problem/A
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    10/05/2020
'''

def main():
    for _ in range(int(input())):
        n = int(input())

        if (n>=1 and n<=9):
            print(f"1\n{n}")
            continue
        count = 0
        roundNumbers = list()
        length = len(str(n))
    
        for index, digit in enumerate(str(n)):
            if digit != '0':
                roundNumbers.append(int(digit)*(10**(length-index-1)))
                count += 1
        print(count)
        print(*roundNumbers)

if __name__ == "__main__":
    main()