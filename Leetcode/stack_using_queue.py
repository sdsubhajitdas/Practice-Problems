# https://leetcode.com/problems/implement-stack-using-queues/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    18/10/2019
'''


class MyStack(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.q1 = list()
        self.q2 = list()

    def push(self, x):
        """
        Push element x onto stack.
        :type x: int
        :rtype: None
        """
        self.q2.append(x)

        while(len(self.q1) > 0):
            self.q2.append(self.q1.pop(0))

        self.q1, self.q2 = self.q2, self.q1

    def pop(self):
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """
        return self.q1.pop(0)

    def top(self):
        """
        Get the top element.
        :rtype: int
        """
        return self.q1[0]

    def empty(self):
        """
        Returns whether the stack is empty.
        :rtype: bool
        """
        return len(self.q1) == 0


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()
