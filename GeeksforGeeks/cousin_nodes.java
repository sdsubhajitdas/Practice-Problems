// https://practice.geeksforgeeks.org/problems/check-if-two-nodes-are-cousins/1/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    17/07/2019
*/

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Cousins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node root = null;
            while (n-- > 0) {
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                if (root == null) {
                    root = new Node(a1);
                    switch (lr) {
                    case 'L':
                        root.left = new Node(a2);
                        break;
                    case 'R':
                        root.right = new Node(a2);
                        break;
                    }
                } else {
                    insert(root, a1, a2, lr);
                }
            }
            int x = sc.nextInt();
            int y = sc.nextInt();
            Node a = new Node(x);
            Node b = new Node(y);
            // inorder(root);
            if (x == y) {
                System.out.println(0);
                continue;
            }
            GfG g = new GfG();
            if (g.ifCousin(root, a, b))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    public static void insert(Node root, int a1, int a2, char lr) {
        if (root == null)
            return;
        if (root.data == a1) {
            switch (lr) {
            case 'L':
                root.left = new Node(a2);
                break;
            case 'R':
                root.right = new Node(a2);
                break;
            }
            return;
        }
        insert(root.left, a1, a2, lr);
        insert(root.right, a1, a2, lr);
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

/*
 * This is a function problem.You only need to complete the function given below
 */
/*
 * Node is as follows: class Node{ int data; Node left,right; Node(int d){
 * data=d; left=right=null; } }
 */
class GfG {

    int level(Node node, Node ptr, int lev) {
        // base cases
        if (node == null)
            return 0;

        if (node == ptr)
            return lev;

        // Return level if Node is present in left subtree
        int l = level(node.left, ptr, lev + 1);
        if (l != 0)
            return l;

        // Else search in right subtree
        return level(node.right, ptr, lev + 1);
    }

    boolean isSibling(Node node, Node a, Node b) {
        // Base case
        if (node == null)
            return false;

        return ((node.left == a && node.right == b) || (node.left == b && node.right == a) || isSibling(node.left, a, b)
                || isSibling(node.right, a, b));
    }

    public boolean ifCousin(Node node, Node a, Node b) {
        // Your Code here.

        return ((level(node, a, 1) == level(node, b, 1)) && (!isSibling(node, a, b)));

    }
}