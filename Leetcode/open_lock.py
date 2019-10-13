# https://leetcode.com/problems/open-the-lock/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''


class Solution:
    def openLock(self, deadends: List[str], target: str) -> int:
        if(target == '0000'):
            return 0

        deadends = set(deadends)

        if('0000' in deadends):
            return -1

        visited = set()
        queue = [('0000', 0)]
        level = None

        while(len(queue) > 0):
            current, level = queue.pop(0)

            if((current not in visited) and (current not in deadends)):

                if(target == current):
                    return level

                for pos in range(4):
                    increase = current[0:pos] + ('0' if current[pos] ==
                                                 '9' else str(int(current[pos])+1)) + current[pos+1:]

                    decrease = current[0:pos] + ('9' if current[pos] ==
                                                 '0' else str(int(current[pos])-1)) + current[pos+1:]

                    queue.append((increase, level+1))
                    queue.append((decrease, level+1))

                visited.add(current)

        return -1