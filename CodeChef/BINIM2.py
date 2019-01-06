# https://www.codechef.com/COOK99B/problems/BINIM2
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    21/10/2018
'''


class Stack:
    stack = list()

    def __init__(self, stack):
        self.stack = stack

    def push(self, x):
        self.stack.append(x)

    def pop(self):
        if len(self.stack) != 0:
            return self.stack.pop()
        else:
            return '-1'

    def peek(self):
        if len(self.stack) != 0:
            return self.stack[-1]
        else:
            return '-1'

    def max_remove(self, s):
        count = 0
        stack_copy = self.stack[:]
        stack_copy.reverse()
        if s == 'Dee':
            for i in stack_copy:
                if i == '0':
                    count += 1
                else:
                    break
        elif s == 'Dum':
            for i in stack_copy:
                if i == '1':
                    count += 1
                else:
                    break

        return count


def main():
    for _ in range(int(input())):
        n, s = input().strip().split()
        stacks = list()
        for _ in range(int(n)):
            inp = list(input().strip())
            inp.reverse()
            stack = Stack(inp)
            stacks.append(stack)

        cannot = False

        while not cannot:
            cannot = True
            if s == 'Dee':
                m = 0
                choice = None
                for stack in stacks:
                    rem = stack.max_remove(s)
                    if rem > m:
                        m = rem
                        choice = stack
                for _ in range(m):
                    cannot = False
                    choice.pop()
                s = 'Dum'
            elif s == 'Dum':
                m = 0
                choice = None
                for stack in stacks:
                    rem = stack.max_remove(s)
                    if rem > m:
                        m = rem
                        choice = stack
                for _ in range(m):
                    cannot = False
                    choice.pop()
                s = 'Dee'

        if s == 'Dee':
            print('Dum')
        elif s == 'Dum':
            print('Dee')


if __name__ == '__main__':
    main()
