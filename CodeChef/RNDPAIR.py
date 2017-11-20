# https://www.codechef.com/problems/RNDPAIR
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	20/11/2017
'''

def main():
    out=[]
    for tc in range(int(input())):
        n=int(input())
        arr=[int(s) for s in input().split(" ")]
        o=[]
        for i in range(len(arr)):
            for j in range(i+1,len(arr)):
                o.append(arr[i]+arr[j])
        out.append(o.count(max(o))/len(o))
    
    for i in out:
        print(i)

main()
