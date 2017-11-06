#https://www.codechef.com/IEMCO4/problems/IEMCO4A
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	4/11/2017
'''

testCase = int(input())
ans = []

for i in range(testCase):
    nk = input().strip().split(" ")
    n = int(nk[0])
    k = int(nk[1])
    s = str(input())

    res = s.count('a')+s.count('e')+s.count('i')+s.count('o')+s.count('u')
    if res >=k:
        ans.append("Good")
    else:
        ans.append("Bad")

for res in ans:
    print(res)
