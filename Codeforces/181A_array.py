# Problem Link
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    DD/MM/2019
'''


def main():
    n = int(input())
    arr = list(map(int, input().strip().split()))
    arr.sort()
    pos = list()
    zero = list()
    neg = list()

    for i in arr:
        if(i > 0):
            pos.append(i)
        elif(i < 0):
            neg.append(i)
        elif(i == 0):
            zero.append(i)
    del arr

    if(len(pos) == 0):
        pos.append(neg.pop())
        pos.append(neg.pop())
    if(len(neg) % 2 == 0):
        zero.append(neg.pop())
    
    print(len(neg), *neg)
    print(len(pos), *pos)
    print(len(zero), *zero)


if __name__ == "__main__":
    main()
