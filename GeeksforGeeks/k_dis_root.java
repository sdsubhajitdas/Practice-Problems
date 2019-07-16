// https://practice.geeksforgeeks.org/problems/k-distance-from-root/1/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    16/07/2019
*/

// Java program to find maximum sum leaf to root
// path in Binary Tree
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

class Main {
    // driver function to test the above functions
    public static void main(String args[])
        {
            // Input the number of test cases you want to run
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0)
            {
                HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
                int n = sc.nextInt();
                int k = sc.nextInt();
                Node root = null;
                while (n > 0)
                {
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    char lr = sc.next().charAt(0);
                    
                    //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                    Node parent = m.get(n1);
                    if (parent == null)
                    {
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
                GfG g = new GfG();
                g.printKdistance(root, k);
                System.out.print("");
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
class GfG {
    // Recursive function to print right view of a binary tree.
    void printKdistance(Node root, int k) {
        if (root == null)
            return;

        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }
        this.printKdistance(root.left, k - 1);
        this.printKdistance(root.right, k - 1);
    }
}