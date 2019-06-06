# https://www.hackerrank.com/challenges/priyanka-and-toys/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    06/06/2019
'''

def main():
    n = int(input())
    array = sorted(list(map(int,input().strip().split())))
    till = array[0]+4
    count = 0
    for element in array:
        if element > till:
            count+=1
            till = element + 4
    
    print(count+1)

if __name__ == "__main__":
    main()