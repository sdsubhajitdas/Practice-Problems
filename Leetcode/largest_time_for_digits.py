# https://leetcode.com/problems/largest-time-for-given-digits/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/09/2020
'''

class Solution:
    def largestTimeFromDigits(self, arr: list) -> str:
        self.maxTime = -1
        self.buildPermutation(arr,0)

        if(self.maxTime == -1):
            return ""
        else:
            return "{:02d}:{:02d}".format(self.maxTime//60,self.maxTime%60)

    def buildPermutation(self, arr: list, start: int):
        if(start == len(arr)):
            self.getTime(arr)
            return

        for i in range(start, len(arr)):
            arr[i], arr[start] = arr[start], arr[i]
            self.buildPermutation(arr, start+1)
            arr[i], arr[start] = arr[start], arr[i]

    def getTime(self, arr):
        hour = arr[0]*10 + arr[1]
        minutes = arr[2]*10 + arr[3]
        if(hour < 24 and minutes < 60):
            self.maxTime = max(self.maxTime, (hour*60+minutes))
