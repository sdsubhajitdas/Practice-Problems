# Problem Link
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    05/06/2019
'''

def main():
    n = int(input())
    array = sorted(list(map(int,input().strip().split())))

    i = n-3
    while ((i>=0)and((array[i]+array[i+1])<=array[i+2])):
        i-=1

    if i>=0:
        print(array[i],array[i+1],array[i+2])
    else:
        print(-1) 


if __name__ == "__main__":
    main()