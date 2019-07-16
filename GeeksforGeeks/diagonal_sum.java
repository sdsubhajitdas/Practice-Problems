// https://practice.geeksforgeeks.org/problems/diagonal-sum-in-binary-tree/1/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    16/07/2019
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

class DiagonalSum {
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
            GfG g = new GfG();
            g.diagonalsum(root);
            System.out.println();
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
        } else {
            insert(root.left, a1, a2, lr);
            insert(root.right, a1, a2, lr);
        }
    }
}

/*
 * This is a function problem.You only need to complete the function given below
 */
/*
 * Complete the function below Node is as follows: class Node{ int data; Node
 * left,right; Node(int d){ data=d; left=right=null; } }
 */
class GfG {
    public void diagonalSumUtil(Node root, int dis, HashMap<Integer, Integer> record) {
        if (root == null)
            return;

        if (!record.containsKey(dis))
            record.put(dis, root.data);
        else
            record.replace(dis, record.get(dis) + root.data);

        this.diagonalSumUtil(root.left, dis + 1, record);

        this.diagonalSumUtil(root.right, dis, record);

    }

    public void diagonalsum(Node root) {
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        this.diagonalSumUtil(root, 0, record);

        int dis = 0;
        while (record.containsKey(dis)) {
            System.out.print(record.get(dis) + " ");
            dis++;
        }
    }
}