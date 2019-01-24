# https://www.codechef.com/problems/TOTR
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    24/1/2019
'''


def get_conversion(conv, m):
    res = list()
    byte = 'abcdefghijklmnopqrstuvwxyz'
    BYTE = byte.upper()
    M = m.upper()
    m = m.lower()
    for msg in conv:
        text = ''
        for char in msg:
            if char.isupper():
                indx = BYTE.index(char)
                text = text + M[indx]
            elif char.islower():
                indx = byte.index(char)
                text = text + m[indx]
            elif char == '_':
                text = text + ' '
            else:
                text = text + char

        res.append(text)

    return res


def main():
    t, m = input().strip().split(' ')
    conv = list()

    for _ in range(int(t)):
        conv.append(input())

    res = get_conversion(conv, m)

    for r in res:
        print(r)


if __name__ == "__main__":
    main()
