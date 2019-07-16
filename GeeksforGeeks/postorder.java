// https://practice.geeksforgeeks.org/problems/postorder-traversal-from-given-inorder-and-preorder-traversals/1/?track=sp-trees&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    16/07/2019
*/

import java.util.*;

class PostOrder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int pre[] = new int[N];
            int in[] = new int[N];
            for (int i = 0; i < N; i++)
                in[i] = sc.nextInt();
            for (int i = 0; i < N; i++)
                pre[i] = sc.nextInt();
            GfG g = new GfG();
            g.printPostOrder(in, pre, N);
            System.out.println();
            T--;
        }
    }
}

/*
 * This is a function problem.You only need to complete the function given below
 */
/*
 * prints the post order traversal of the tree
 */
class GfG {
    int preIdx = 0;

    void printPostOrderUtil(int in[], int pre[], int start, int end, HashMap<Integer, Integer> hm) {

        if (start > end)
            return;

        int idx = hm.get(pre[preIdx++]);

        // Left Tree
        this.printPostOrderUtil(in, pre, start, idx - 1, hm);
        
        // Right Tree
        this.printPostOrderUtil(in, pre, idx + 1, end, hm);

        System.out.print(in[idx] + " ");
    }

    void printPostOrder(int in[], int pre[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < in.length; i++) {
            hm.put(in[i], i);
        }

        this.printPostOrderUtil(in, pre, 0, n - 1, hm);
    }
}