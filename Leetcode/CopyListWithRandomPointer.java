// https://leetcode.com/problems/copy-list-with-random-pointer/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/05/2022
*/

import java.util.*;

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  public Node copyRandomList(Node head) {
    if(head == null) return head;
    if(head.next == null) new Node(head.val);

    Node currentNode=head, nextNode=null;

    while(currentNode != null) {
      Node deepCopyNode = new Node(currentNode.val);
      nextNode = currentNode.next;
      currentNode.next = deepCopyNode;
      deepCopyNode.next = nextNode;
      currentNode = nextNode;
    }

    currentNode = head;

    while(currentNode != null) {
      currentNode.next.random = currentNode.random != null ? currentNode.random.next : null;
      currentNode = currentNode.next.next;
    }

    Node copyHead = null;
    currentNode = head;
    while(currentNode != null) {
      if(copyHead == null) copyHead = currentNode.next;
      
      nextNode = currentNode.next.next;
      Node deepCopyNode = currentNode.next;
      currentNode.next = nextNode;
      deepCopyNode.next = nextNode != null ? nextNode.next : null;

      currentNode = nextNode;
    }

    return copyHead;
  }
}
