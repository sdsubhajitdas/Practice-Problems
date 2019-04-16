# https://www.codechef.com/APRIL19B/problems/MAXREM
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    17/4/2019
'''


def main():
    n = int(input())
    array = list(set(map(int, input().split())))
    if len(array) == 1:
        print(0)
        return
    
    a1 = max(array)
    array.remove(a1)
    a2 = max(array)
    print(a2%a1)



if __name__ == '__main__':
    main()
