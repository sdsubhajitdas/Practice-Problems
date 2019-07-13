# https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1/?track=sp-trees&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/07/2019
'''


class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None


# Driver Program
if __name__ == '__main__':

    root = None
    t = int(input())
    for i in range(t):
        n = int(input())
        arr = input().strip().split()
        if n == 0:
            print(0)
            continue
        dictTree = dict()

        for j in range(n):
            if arr[3*j] not in dictTree:
                dictTree[arr[3*j]] = Node(arr[3*j])
                parent = dictTree[arr[3*j]]
                if j is 0:
                    root = parent

            else:
                parent = dictTree[arr[3*j]]

            child = Node(arr[3*j+1])
            if (arr[3*j+2] == 'L'):
                parent.left = child
            else:
                parent.right = child
            dictTree[arr[3*j+1]] = child

        print(countLeaves(root))

''' This is a function problem.You only need to complete the function given below '''
# User function Template for python3
'''
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None
'''
# your task is to complete this function
# function should return the count of Leaf node's
# Note: You required to print a new line after every test case


def count(root):
    if(root == None):
        return 1
    return 0 + count(root.left) + count(root.right)


def countLeaves(root):
    # Code here
    return count(root)//2
