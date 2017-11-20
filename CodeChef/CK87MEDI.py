# https://www.codechef.com/problems/CK87MEDI
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    20/11/2017
'''


def main():
    out = []
    for tc in range(int(input())):
        nk = input().strip().split(" ")
        nk = [int(x) for x in nk]
        inp = input().strip().split(" ")
        inp = [int(x) for x in inp]
        inp.sort()
        out.append( inp[int(sum(nk)/2)] )
    
    for e in out:
        print (e)

main()
