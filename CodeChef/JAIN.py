# https://www.codechef.com/MARCH19B/problems/JAIN
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    8/3/2018
'''

def main():
    for _ in range(int(input())):
        n = int(input())
        desc = list()
        count = 0
        full = 'aeiou'
        table = dict()

        for _ in range(n):
            desc.append(''.join(sorted(''.join(set(input())))))

        desc.sort(key=lambda x: len(x))

        # counting
        for d in desc:
            if d in table.keys():
                table[d] += 1
            else:
                table[d] = 1

        keys = list(table.keys())

        if desc[-1] == full:
            count += sum(range(1, table[full]))

        for index, i in enumerate(keys):
            for j in keys[index+1:]:
                s = ''.join(sorted(''.join(set(i+j))))
                if s == full:
                    count += table[i] * table[j]

        print(count)


if __name__ == "__main__":
    main()
