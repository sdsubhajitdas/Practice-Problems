# https://leetcode.com/problems/decode-string/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    18/10/2019
'''


class Solution(object):
    def decodeString(self, s):
        """
        :type s: str
        :rtype: str
        """

        return self.decodeStringHelper(list(s), 0)

    def decodeStringHelper(self, code, idx):

        k = ""
        retuStr = ""

        while(idx < len(code)):
            if(code[idx] == '['):
                tempStr, idx = self.decodeStringHelper(code, idx+1)
                retuStr += (tempStr*int(k))
                k = ""

            elif(code[idx] == ']'):
                return retuStr if(k == "") else retuStr * int(k), idx

            elif('0' <= code[idx] <= '9'):
                k += code[idx]
            else:
                retuStr += code[idx]
            idx += 1

        return retuStr
