# https://practice.geeksforgeeks.org/problems/armstrong-numbers/0/?track=interview-mathematical
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	13/1/2019
'''


def main():
    for _ in range(int(input())):
        n = input()
        m = str(sum([int(i)*int(i)*int(i) for i in n]))
        if n == m:
            print('Yes')
        else:
            print('No')   
        

if __name__ == "__main__":
    main()
