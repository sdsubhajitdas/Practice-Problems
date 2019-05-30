# https://leetcode.com/problems/longest-substring-without-repeating-characters/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/05/2019
'''


class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len = 0
        freq = set()
        start, end = 0, 0

        if len(s) == 1:
            return 1

        while start < len(s) and end < len(s):
            if s[end] not in freq:
                freq.add(s[end])
                end += 1
                max_len = max(max_len, end - start)
            else:
                freq.remove(s[start])
                start += 1

        return max_len
