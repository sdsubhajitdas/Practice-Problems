# https://www.hackerrank.com/challenges/bon-appetit/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    03/06/2019
'''

def main():
    n, k = map(int,input().strip().split())
    bill = list(map(int,input().strip().split()))
    charge = int(input())

    extra_charge = abs(((sum(bill) - bill[k])//2)- charge)

    print("Bon Appetit" if extra_charge == 0 else extra_charge)
        


if __name__ == "__main__":
    main()