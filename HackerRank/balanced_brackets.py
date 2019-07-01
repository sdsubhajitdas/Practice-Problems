# https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=stacks-queues
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/07/2019
'''


def main():
    for _ in range(int(input())):
        n = input()
        stack = list()
        flag = True
        if(_ == 14):
            count = 0
        for ch in n:
            l = len(stack)
            if(ch == '('):
                stack.append(')')
            elif(ch == '{'):
                stack.append('}')
            elif(ch == '['):
                stack.append(']')
            elif(ch == ')' or ch == '}' or ch == ']'):
                if(l != 0 and ch == stack[-1]):
                    stack.pop()
                else:
                    flag = False
                    break
        print('YES' if (flag and len(stack) == 0) else 'NO')


if __name__ == "__main__":
    main()
