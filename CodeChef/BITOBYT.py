# https://www.codechef.com/OCT18B/problems/BITOBYT
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    8/10/2018
'''

from sys import stdin, stdout


def main():
    tc = int(stdin.readline().strip())
    for _ in range(tc):
        n = int(stdin.readline().strip())
        bit, nibble, byte = 1, 0, 0
        t = 3
        if n == 0:
            bit = 0
        time = [0]*3
        while t <= n:
            change = [None]*3
            
            # Bit changing into nibble
            if t % 2 == 1 and bit != 0:
                #print("Changing Bit to Nibble")
                change[1] = bit
                bit = 0
                time[1] = t-1

            # Nibble changing into byte
            if (t-time[1]) % 8 == 1 and nibble != 0:
                #print("Changing Nibble to Byte")
                change[2] = nibble
                nibble = 0
                time[2] = t-1

            # Byte splitting into bits
            if (t-time[2]) % 16 == 1 and byte != 0:
                #print("Changing Byte to Bits")
                change[0] = byte * 2
                byte = 0

            bit = change[0] if change[0] != None else bit
            nibble = change[1] if change[1] != None else nibble
            byte = change[2] if change[2] != None else byte
            #stdout.write("{0}\t{1} {2} {3}\n".format(t,bit, nibble, byte))
            t += 2
        stdout.write("{0} {1} {2}\n".format(bit, nibble, byte))


if __name__ == '__main__':
    main()
