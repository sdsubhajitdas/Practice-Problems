# https://leetcode.com/problems/implement-strstr/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/09/2019
'''


class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        ln, lh = len(needle), len(haystack)
        if(needle == "" or
           (ln == lh and needle == haystack)):
            return 0
        if(lh == 0):
            return -1

        chars = list(haystack)
        
        for i in range(lh-ln+1):
            if(needle == "".join(chars[i:i+ln])):
                return i
            i+=1
        
        return -1


if __name__ == "__main__":
    print(Solution().strStr("mississippi", "issip"))
