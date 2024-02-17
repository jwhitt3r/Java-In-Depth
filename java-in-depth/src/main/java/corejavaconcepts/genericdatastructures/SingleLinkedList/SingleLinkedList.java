package corejavaconcepts.genericdatastructures.SingleLinkedList;

public class SingleLinkedList {
  Node head;

  public SingleLinkedList(){
    this.head = null;
  }

  public void insert(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.value + " ");
      current = current.next;
    }
  }
}


