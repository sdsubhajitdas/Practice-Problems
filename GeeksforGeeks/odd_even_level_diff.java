
import java.util.*;
import java.lang.Integer;
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

class Level_Difference {
    // driver function to test the above functions
    public static void main(String args[]) {

        // Input the number of test cases you want to run
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
                // cout << n1 << " " << n2 << " " << (char)lr << endl;
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

            GfG g = new GfG();

            System.out.println(g.getLevelDiff(root));
            t--;

        }
    }
}

/*
 * This is a function problem.You only need to complete the function given below
 */
// A Binary Tree node
/*
 * class Node { int data; Node left, right; Node(int item) { data = item; left =
 * right = null; } }
 */
class GfG { /* You are required to complete this function */
    int getLevelDiff(Node root) {
        int odd = this.getSum(root, 1, 1);
        int even = this.getSum(root, 1, 0);
        return odd - even;
    }

    int getSum(Node root, int level, int rem) {
        if (root == null)
            return 0;
        int ret = 0;
        if (level % 2 == rem)
            ret = root.data;
        return ret + this.getSum(root.left, level + 1, rem) + this.getSum(root.right, level + 1, rem);
    }

}