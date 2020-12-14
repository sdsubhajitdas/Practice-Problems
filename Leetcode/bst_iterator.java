// https://leetcode.com/problems/binary-search-tree-iterator/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    15/12/2020
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.Stack;

class BSTIterator {
    TreeNode root;
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.root = root;
        stack = new Stack<>();

        this.inOrderLeft(root);
    }
    
    public int next() {
        TreeNode node = this.stack.pop();
        if(node.right != null) {
            this.inOrderLeft(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        return this.stack.size() > 0;
    }

    private void inOrderLeft(TreeNode root){
        while(root != null){
            this.stack.add(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */