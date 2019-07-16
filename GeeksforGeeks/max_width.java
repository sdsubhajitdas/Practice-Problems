// https://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    16/07/2019
*/

// INITIAL CODE
import java.util.*;
import java.lang.*;
import java.io.*;

// A Binary Tree node
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Maximum_Width_Of_Tree {
    void inorder(Node node) {
        if (node == null)
            return;
        else
            inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);

    }

    // driver function to test the above functions
    public static void main(String args[]) {
        // Maximum_Width_Of_Trees CLN = new Maximum_Width_Of_Tree();
        // Index index_obj = new Index();
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
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
            int res = g.getMaxWidth(root);
            System.out.println(res);
            // CLN.inorder(root);
            t--;
            // System.out.println();
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
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root) {
        Integer count[] = new Integer[101];
        Arrays.fill(count, 0);
        this.getMaxWidthUtil(root, 1, count);
        return Collections.max(Arrays.asList(count));
    }

    void getMaxWidthUtil(Node root, int level, Integer[] count) {
        if (root == null)
            return;

        count[level] += 1;
        this.getMaxWidthUtil(root.left, level + 1, count);
        this.getMaxWidthUtil(root.right, level + 1, count);
    }
}
