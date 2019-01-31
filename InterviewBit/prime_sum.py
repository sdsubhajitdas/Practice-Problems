# https://www.interviewbit.com/problems/prime-sum/
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	28/1/2018
'''


class Solution:

    def _prime_seive(self, n):
        arr = [True]*(n+1)
        arr[0] = arr[1] = False
        p = 2
        while p*p <= n:
            if arr[p] == True:
                i = p*2
                while i <= n:
                    arr[i] = False
                    i += p
            p += 1

        return arr

    def primesum(self, n):
        # @param A : integer
        # @return a list of integers
        prime_list = self._prime_seive(n)
        for half1 in range(2, n-1):
            half2 = n-half1
            if prime_list[half1] and prime_list[half2]:
                return[half1, half2]

