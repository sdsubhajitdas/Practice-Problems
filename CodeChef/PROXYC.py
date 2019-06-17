# https://www.codechef.com/JUNE19B/problems/PROXYC
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    09/06/2019
'''


def main():
    for _ in range(int(input())):
        d = int(input())
        reg = list(input())
        present = reg.count('P')
        attendance = present/d
        i = 2
        proxy = 0
        while (attendance < 0.75 and i < d-2):
            if reg[i] != 'P':
                if ((reg[i-2] == 'P' or reg[i-1] == 'P') and (reg[i+2] == 'P' or reg[i+1] == 'P')):
                    proxy += 1
                    present += 1
            i += 1
            attendance = present / d

        if attendance < 0.75:
            proxy = -1
        print(proxy)


if __name__ == "__main__":
    main()
