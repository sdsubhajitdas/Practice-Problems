# https://leetcode.com/problems/min-stack/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''


class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = list()
        self.min_stack = list()

    def push(self, x: int) -> None:
        if(len(self.stack) <= 0):
            self.stack.append(x)
            self.min_stack.append(x)
            return

        self.stack.append(x)
        self.min_stack.append(min(self.min_stack[-1], x))

    def pop(self) -> None:
        self.stack.pop()
        self.min_stack.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.min_stack[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
