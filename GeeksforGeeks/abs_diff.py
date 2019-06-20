# https://practice.geeksforgeeks.org/problems/absolute-difference-1/0/?track=sp-arrays-and-searching&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    20/06/2019
'''
def diff(x:int) -> bool:
    if (x<= 9):
        return False
    x = [int(i) for i in str(x)]
    for idx in range(1,len(x)):
        if (abs(x[idx]-x[idx-1])!= 1):
            return False
    return True

def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        arr = list(map(int,input().strip().split()))
        printed = False

        for i in arr:
            if (i < k):
                if diff(i):
                    print(i,end=' ')
                    printed = True

        if not printed:
            print(-1)
        else:
            print()
    

if __name__ == "__main__":
    main()