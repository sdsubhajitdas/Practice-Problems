// https://leetcode.com/problems/lfu-cache/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    22/06/2022
*/

import java.util.*;

class LFUCache {

  private int capacity, minFrequency, currentSize;
  private HashMap<Integer, Node> existMap;
  private HashMap<Integer, DoubleLinkedList> frequencyTable;

  public LFUCache(int capacity) {
    this.capacity = capacity;
    minFrequency = Integer.MAX_VALUE;
    currentSize = 0;

    existMap = new HashMap<>();
    frequencyTable = new HashMap<>();
  }
  
  public int get(int key) {
    if(existMap.getOrDefault(key, null) == null) return -1;

    Node node = existMap.get(key);
    this.updateNode(node);
    return node.value;
  }
  
  public void put(int key, int value) {
    if(capacity == 0) return;

    if(existMap.getOrDefault(key, null) != null) {
      Node node = existMap.get(key);
      node.value = value;
      this.updateNode(node);
      return;
    }

    currentSize++;
    if(currentSize > capacity) {
      DoubleLinkedList list = frequencyTable.get(minFrequency);
      existMap.remove(list.stop.previous.key);
      list.remove(list.stop.previous);
      currentSize--;
    }

    minFrequency = 1;
    Node node = new Node(key, value).setFrequency(1);

    DoubleLinkedList list = frequencyTable.getOrDefault(1, new DoubleLinkedList());
    list.add(node);
    existMap.put(key, node);
    frequencyTable.put(1, list);
  }

  private void updateNode(Node node) {
    DoubleLinkedList list = frequencyTable.get(node.frequency);
    list.remove(node);

    if(minFrequency == node.frequency && list.size == 0) {
      frequencyTable.remove(node.frequency);
      minFrequency++;
    }

    node.frequency++;
    DoubleLinkedList nextFreqList = frequencyTable.getOrDefault(node.frequency, new DoubleLinkedList());
    nextFreqList.add(node);
    frequencyTable.put(node.frequency, nextFreqList);
  }

  private class Node {
    int key, value, frequency;
    Node previous, next;
    
    Node(int key, int value) {this.key = key; this.value = value;}

    public Node setFrequency(int frequency) {
      this.frequency = frequency;
      return this;
    }
  }

  private class DoubleLinkedList {
    int size;
    Node start, stop;

    DoubleLinkedList() {
      start = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE);
      stop = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE);

      start.next = stop;
      stop.previous = start;
      size = 0;
    }

    public void add(Node node) {
      Node nextNode = start.next;
      
      start.next = node;
      node.previous = start;

      node.next = nextNode;
      nextNode.previous = node;

      size++;
    }

    public void remove(Node node) {
      Node before = node.previous;
      Node after = node.next;

      before.next = after;
      after.previous = before;

      node.previous = null;
      node.next = null;
      size--;
    }

  }
}

/**
* Your LFUCache object will be instantiated and called as such:
* LFUCache obj = new LFUCache(capacity);
* int param_1 = obj.get(key);
* obj.put(key,value);
*/