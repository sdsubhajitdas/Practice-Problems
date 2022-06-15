/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    14/06/2022
*/

import java.util.*;

public class MinHeap {
  private int size;
  private ArrayList<Integer> array;

  public MinHeap() {
    size = 0;
    array = new ArrayList<>();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  private int getLeftChildIndex(int parentIndex) { return 2*parentIndex+1; }
  private int getRightChildIndex(int parentIndex) { return 2*parentIndex+2; }
  private int getParentIndex(int childIndex) { return (childIndex-1)/2; }

  private boolean hasLeftChild(int index) { return this.getLeftChildIndex(index) < size; }
  private boolean hasRightChild(int index) { return this.getRightChildIndex(index) < size; }
  private boolean hasParent(int index) { return this.getParentIndex(index) >= 0; }

  private int getLeftChild(int parentIndex) { return array.get(this.getLeftChildIndex(parentIndex)); }
  private int getRightChild(int parentIndex) { return array.get(this.getRightChildIndex(parentIndex)); }
  private int getParent(int childIndex) { return array.get(this.getParentIndex(childIndex)); }
  private int getLastElement() { return array.get(size-1); }

  private void swap(int indexOne, int indexTwo) {
    int temp = array.get(indexOne);
    array.set(indexOne, array.get(indexTwo));
    array.set(indexTwo, temp);
  }

  public int peek() throws Exception {
    if(size == 0) throw new Exception("Heap is empty");
    return array.get(0);
  }

  public int poll() throws Exception {
    if(size == 0) throw new Exception("Heap is empty");
    int element = array.get(0);
    array.set(0, this.getLastElement());
    array.remove(size-1);
    size--;
    this.heapifyDown();
    return element;
  }

  public void add(int element) {
    array.add(element);
    size++;
    this.heapifyUp();
  }

  private void heapifyDown() {
    int index = 0;
    while(hasLeftChild(index)) {
      int smallerChildIndex = getLeftChildIndex(index);
      if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
        smallerChildIndex = getRightChildIndex(index);
      }

      if(array.get(index) < array.get(smallerChildIndex)) break;
      // System.out.print("Heapify Down "+index + " "+ smallerChildIndex);
      swap(index, smallerChildIndex);
      index = smallerChildIndex;
    }
  }

  private void heapifyUp() {
    int index = size-1;
    while(hasParent(index) && getParent(index) > array.get(index)) {
      swap(getParentIndex(index), index);
      index = getParentIndex(index);
    }
  }

  public void printHeap() {
    for(int i=0; i<size; i++) System.out.print(array.get(i)+" ");
    System.out.println();
  }
}

class Driver {
  public static void main(String args[]) throws Exception{
    MinHeap heap = new MinHeap();

    heap.add(1);
    heap.add(10);
    heap.add(4);
    heap.add(2);
    heap.printHeap();
    System.out.println(heap.poll());
    heap.printHeap();
    heap.add(5);
    heap.add(6);
    heap.add(-1);
    heap.printHeap();
  }
}