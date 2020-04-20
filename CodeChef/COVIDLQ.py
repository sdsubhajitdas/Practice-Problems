# https://www.codechef.com/APRIL20B/problems/COVIDLQ
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    20/04/2020
'''

def main():
    for _ in range(int(input())):
        n = int(input())
        occupiedList = list(map(int,input().strip().split()))
        print(covidHelper(occupiedList))
    

def covidHelper(occupiedList):
    lastPersonIndex = -6
    for index, occupied in enumerate(occupiedList):
        if occupied:
            if (index - lastPersonIndex < 6):
                return "NO"
            lastPersonIndex = index
    return "YES"


if __name__ == "__main__":
    main()