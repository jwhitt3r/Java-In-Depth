package corejavaconcepts.genericdatastructures.DoubleLinkedList;

public class Node <T> {

  Node prev;
  Node next;
  T value;

  public Node(T value){
    this.prev = null;
    this.value = value;
    this.next = null;
  }
}
