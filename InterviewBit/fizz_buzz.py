# https://www.interviewbit.com/problems/fizzbuzz/
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	31/1/2018
'''


class Solution:
    # @param A : integer
    # @return a list of strings
    def fizzBuzz(self, n):
        arr = list(range(n+1))

        for idx in range(1, n+1):
            if idx % 3 == 0 and idx % 5 == 0:
                arr[idx] = 'FizzBuzz'
            elif idx % 3 == 0:
                arr[idx] = 'Fizz'
            elif idx % 5 == 0:
                arr[idx] = 'Buzz'
            else:
                arr[idx] == str(idx)
        
        arr.pop(0)
        return arr
