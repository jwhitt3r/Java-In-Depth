package corejavaconcepts.genericdatastructures.SingleLinkedList;

public class Node <T> {
  Node next;
  T value;

  public Node(T value){
    this.value = value;
    this.next = null;
  }
}
