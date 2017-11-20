#https://www.codechef.com/UEMC2017/problems/UEMCOSA2
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    29/10/2017
'''

def countnum(x):
    r = 0
    while x != 0:
        x = int(x / 10)
        r += 1
    return r


n = int(input())
i =1
j=1
while j<=n:
    for k in range(j):
        temp = 8 * (i * i) - 1
        print("{0}{1} ".format((5 - countnum(temp)) * "0", temp), end='')
        i += 1
    print("\n")
    j+=1

