# https://www.hackerrank.com/challenges/ip-address-validation/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/07/2019
'''
import re


def main():
    for _ in range(int(input())):
        ip = input().strip()

        ip4 = r'^(([0-9]|[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])$'
        ip6 = r'^(([a-f0-9]{0,4}:){7})([a-f0-9]{0,4})$'

        if(re.search(ip4,ip)):
            print('IPv4')
        elif(re.search(ip6,ip)):
            print('IPv6')
        else:
            print('Neither')

if __name__ == "__main__":
    main()
