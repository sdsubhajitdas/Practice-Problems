// https://leetcode.com/problems/clone-n-ary-tree/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/07/2021
*/

import java.util.*;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    
    public Node() {
        children = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }
    
    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public Node cloneTree(Node root) {
        if(root == null) return null;
        
        if(root.children == null) {
            return new Node(root.val);
        }
        if(root.children.size() == 0) {
            return new Node(root.val);
        }

        ArrayList<Node> child = new ArrayList<>();

        for(Node node: root.children) {
            child.add(this.cloneTree(node));
        }

        return new Node(root.val, child);
    }
}