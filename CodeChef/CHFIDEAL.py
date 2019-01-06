# https://www.codechef.com/DEC18B/problems/CHFIDEAL
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    12/12/2018
'''

from sys import stdout
from random import randint

def main():
    o = [1,2,3]
    
    x = randint(1,3)
    print(x)
    stdout.flush()
    
    y = int(input())
    
    o.remove(x)
    o.remove(y)
    
    print(o[0])
    stdout.flush()

if __name__ =='__main__':
    main()