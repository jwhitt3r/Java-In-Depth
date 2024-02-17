package corejavaconcepts.genericdatastructures.CircularLinkedList;

public class Node <T> {
  T value;
  Node next;

  public Node(T data) {
    this.value = data;
  }
}