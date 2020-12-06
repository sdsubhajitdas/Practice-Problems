// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/12/2020
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

import java.util.HashMap;

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        if (root.left == null && root.right == null) return root;

        HashMap<Integer,Node> heightTable = new HashMap<Integer, Node>();
        connectNext(root, 0, heightTable);
        return root;
    }

    private void connectNext(Node node, int height, HashMap<Integer, Node> heightTable){
        if(node == null) return ;

        connectNext(node.right, height+1, heightTable);
        if(heightTable.containsKey(height)){
            node.next = heightTable.get(height);
            heightTable.put(height, node);
        }else{
            heightTable.put(height, node);
        }
        connectNext(node.left, height+1, heightTable);
    }
}