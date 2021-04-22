// https://www.interviewbit.com/problems/lru-cache/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    23/04/2021
*/

import java.util.*;

public class Solution {
    
    HashMap<Integer, DNode> map;
    int capacity;
    DNode qStart,qEnd;
    public Solution(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        qStart = new DNode(-1,-1);
        qEnd = new DNode(Integer.MAX_VALUE, Integer.MAX_VALUE);

        qStart.next = qEnd;
        qEnd.prev = qStart;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            DNode node = map.get(key);
            this.removeFromQueue(node);
            this.addToQueue(node);
            return node.value;
        }
        return -1;
    }
    
    public void set(int key, int value) {
        DNode node = new DNode(key,value);
        if(map.containsKey(key)) {
            DNode temp = map.get(key);
            this.removeFromQueue(temp);
            this.addToQueue(node);
        }
        else {
            if(this.capacity == map.size()) {
                DNode temp = this.qEnd.prev;
                this.removeFromQueue(temp);
                map.remove(temp.key);
            }
            this.addToQueue(node);
        }
        map.put(key, node);
    }

    private void addToQueue(DNode node) {
        node.next = qStart.next;
        qStart.next = node;
        node.prev = qStart;
        node.next.prev = node;
    }

    private void removeFromQueue(DNode node) {
        DNode temp = node.next;
        node.prev.next = temp;
        temp.prev = node.prev;
    }

    private class DNode {
        int key,value;
        DNode next,prev;
        
        DNode(int key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
}
