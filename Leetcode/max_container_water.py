# https://leetcode.com/problems/container-with-most-water/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/05/2019
'''


class Solution:
    def maxArea(self, height):
        max_area = 0
        length = len(height)
        left, right = 0, length - 1
        #print(height)
        while left < right:
            #print(f'Left:{left}\tRight:{right}')
            area = min(height[left], height[right]) *  \
                (right - left)
            #print(f'Area:{area}')
            max_area = max(max_area,area)

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_area


if __name__ == "__main__":
    print(Solution().maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]))
