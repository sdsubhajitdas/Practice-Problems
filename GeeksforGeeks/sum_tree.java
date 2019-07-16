
// https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    16/07/2019
*/

import java.util.*;

class Tree {
    int data;
    Tree left, right;

    Tree(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class SumTree {

    public static void inOrder(Tree node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Tree root = null;
            if (n == 1) {
                System.out.println(sc.nextInt());
                n--;
                continue;
            } else {
                while (n-- > 0) {
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    char lr = sc.next().charAt(0);
                    if (root == null) {
                        root = new Tree(n1);
                        switch (lr) {
                        case 'L':
                            root.left = new Tree(n2);
                            break;
                        case 'R':
                            root.right = new Tree(n2);
                            break;
                        }
                    } else {
                        insert(n1, n2, lr, root);
                    }
                }
            }
            GfG g = new GfG();
            g.toSumTree(root);
            inOrder(root);
            System.out.println();
        }
    }

    public static void insert(int n1, int n2, char lr, Tree root) {
        if (root == null)
            return;
        if (root.data == n1) {
            switch (lr) {
            case 'L':
                root.left = new Tree(n2);
                break;
            case 'R':
                root.right = new Tree(n2);
                break;
            }
        }
        insert(n1, n2, lr, root.left);
        insert(n1, n2, lr, root.right);
    }
}

/*
 * This is a function problem.You only need to complete the function given below
 */
/*
 * Complete the Given Function Node is as follows: class Tree{ int data; Tree
 * left,right; Tree(int d){ data=d; left=null; right=null; } }
 */
class GfG {
    public void toSumTree(Tree root) {
        this.toSumTreeUtil(root);
    }

    public int toSumTreeUtil(Tree root) {
        int val = 0;
        int left, right;
        if (root == null) {
            return 0;
        }
        left = this.toSumTreeUtil(root.left);
        right = this.toSumTreeUtil(root.right);

        val = root.data + left + right;
        root.data = val - root.data;
        return val;
    }
}