// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    16/07/2019
*/

import java.util.Scanner;
import java.lang.Integer;
import java.util.HashMap;
import java.io.*;
import java.util.*;

// A Binary Tree node
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Tree_Left_View {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // Node root=null;
        while (t > 0) {
            HashMap<Integer, Node> m = new HashMap<Integer, Node>();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                Node parent = m.get(n1);
                if (parent == null) {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
            Tree g = new Tree();
            g.leftView(root);
            System.out.println();
            t--;
        }
    }
}

/*
 * This is a function problem.You only need to complete the function given below
 */
/*
 * A Binary Tree node class Node { int data; Node left, right; Node(int item) {
 * data = item; left = right = null; } }
 */
class Tree {
    void leftView(Node root) {
        int[] maxlevel = { 0 };
        this.leftViewUtil(root, 1, maxlevel);

    }

    void leftViewUtil(Node root, int level, int[] maxlevel) {
        if (root == null)
            return;

        if (maxlevel[0] < level) {
            System.out.print(root.data + " ");
            maxlevel[0] = level;
        }

        this.leftViewUtil(root.left, level + 1, maxlevel);
        this.leftViewUtil(root.right, level + 1, maxlevel);
    }
}
