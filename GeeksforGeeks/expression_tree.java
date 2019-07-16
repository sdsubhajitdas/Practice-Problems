// https://practice.geeksforgeeks.org/problems/expression-tree/1/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    16/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    String data;
    Node left, right;

    Node(String d) {
        data = d;
        left = null;
        right = null;
    }
}

class ExpressionTree {
    static Node root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++)
                s[i] = sc.next();
            GfG g = new GfG();

            root = null;
            makeTree(s, n);
            System.out.println(g.evalTree(root));
        }
    }

    public static void makeTree(String[] s, int n) {
        Queue<Node> queue = new LinkedList<Node>();
        root = new Node(s[0]);
        queue.add(root);
        int p = 1;
        try {
            while (n > 0) {
                Node proot = queue.poll();
                proot.left = new Node(s[p]);
                queue.add(proot.left);
                p++;
                n--;
                if (n > 0) {
                    proot.right = new Node(s[p]);
                    queue.add(proot.right);
                    p++;
                    n--;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
        }
    }
}

/*
 * This is a function problem.You only need to complete the function given below
 */
/*
 * A Tree node is defined as class Node { String data; Node left,right;
 * Node(String data) { this.data = data; this.left = null; this.right = null; }
 * }
 */
class GfG {
    public int evalTree(Node root) {
        if (root.left == null && root.right == null)
            return Integer.parseInt(root.data);

        int left = 0, right = 0;

        if (root.left != null) {
            left = this.evalTree(root.left);
        }

        if (root.right != null) {
            right = this.evalTree(root.right);
        }

        switch (root.data) {

        case "+":
            return left + right;
        case "-":
            return left - right;
        case "*":
            return left * right;
        case "/":
            return left / right;
        }
        return 0;
    }
}