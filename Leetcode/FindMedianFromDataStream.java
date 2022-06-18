// https://leetcode.com/problems/find-median-from-data-stream/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/06/2022
*/

import java.util.*;

class MedianFinder {

  PriorityQueue<Integer> smallHeap;
  PriorityQueue<Integer> largeHeap;
  public MedianFinder() {
    smallHeap = new PriorityQueue<>(Collections.reverseOrder());
    largeHeap = new PriorityQueue<>();
  }
  
  public void addNum(int num) {
    if(smallHeap.isEmpty() || smallHeap.peek() >= num)
      smallHeap.add(num);
    else 
      largeHeap.add(num);

    if(smallHeap.size() > largeHeap.size()+1)
      largeHeap.add(smallHeap.poll());
    else if(smallHeap.size() < largeHeap.size())
      smallHeap.add(largeHeap.poll());
  }
  
  public double findMedian() {
    if(smallHeap.size() == largeHeap.size()) {
      return smallHeap.peek()/2.0 + largeHeap.peek()/2.0;
    }
    return smallHeap.peek();
  }
}

/**
* Your MedianFinder object will be instantiated and called as such:
* MedianFinder obj = new MedianFinder();
* obj.addNum(num);
* double param_2 = obj.findMedian();
*/