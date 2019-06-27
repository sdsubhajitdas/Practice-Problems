# https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=trees
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/06/2019
'''


""" Node is defined as
class node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
"""


def check(root, mn, mx):
    if(root == None):
        return True

    return (mn < root.data) and (root.data < mx) and \
        check(root.left, mn, root.data) and \
        check(root.right, root.data, mx)


def checkBST(root):
    return check(root, -1, 10**4+1)
