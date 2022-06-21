// https://leetcode.com/problems/lru-cache/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/06/2022
*/

import java.util.*;

class LRUCache {

  private class DLLNode {
    int key, value;
    DLLNode previous, next;
    DLLNode(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  private int capacity;
  private HashMap<Integer, DLLNode> table;
  private DLLNode start, stop;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    start = new DLLNode(Integer.MIN_VALUE, Integer.MIN_VALUE);
    stop = new DLLNode(Integer.MAX_VALUE, Integer.MAX_VALUE);
    start.next = stop;
    stop.previous = start;

    table = new HashMap<>();
  }
  
  public int get(int key) {
    if(table.getOrDefault(key, null) == null) {
      return -1;
    }
    DLLNode node = table.get(key);
    this.removeNode(node);
    this.insertNode(node);
    return node.value;
  }
  
  public void put(int key, int value) {
    if(table.getOrDefault(key, null) != null) {
      DLLNode node = table.get(key);
      node.value = value;
      this.removeNode(node);
      this.insertNode(node);
    }
    else if(table.size() >= capacity) {
      DLLNode lastNode = stop.previous;
      this.removeNode(lastNode);
      this.insertNode(new DLLNode(key, value));
    }
    else {
      DLLNode node = new DLLNode(key, value);
      this.insertNode(node);
    }
  }

  private void insertNode(DLLNode node) {
    DLLNode after = start.next;
    start.next = node;
    node.previous = start;
    
    node.next = after;
    after.previous = node;
    table.put(node.key, node);
  }

  private void removeNode(DLLNode node) {
    DLLNode before = node.previous;
    DLLNode after = node.next;

    before.next = after;
    after.previous = before;
    table.remove(node.key);
  }
}

/**
* Your LRUCache object will be instantiated and called as such:
* LRUCache obj = new LRUCache(capacity);
* int param_1 = obj.get(key);
* obj.put(key,value);
*/