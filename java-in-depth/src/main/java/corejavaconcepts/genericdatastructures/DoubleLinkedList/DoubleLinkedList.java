package corejavaconcepts.genericdatastructures.DoubleLinkedList;

public class DoubleLinkedList {
  Node head;
  Node tail;

  public DoubleLinkedList(){
    this.head = null;
    this.tail = null;
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
      newNode.prev = current;
    }
  }

    public void display(){
      Node current = head;
      while (current != null) {
        System.out.print(current.value + " <-> ");
        current = current.next;
      }
      System.out.println("null");
    }


}
