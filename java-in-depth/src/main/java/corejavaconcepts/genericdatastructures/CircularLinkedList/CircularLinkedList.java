package corejavaconcepts.genericdatastructures.CircularLinkedList;

public class CircularLinkedList <T>{
  Node head;

  public void add(T data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      head.next = head;
    } else {
      Node currentNode = head;
      while (currentNode.next != head) {
        currentNode = currentNode.next;
      }

      currentNode.next = newNode;
      newNode.next = head;
    }
  }

  public void display() {
    Node node = head;
    if(node != null) {
      do {
        System.out.print(node.value + " -> ");
        node = node.next;
      } while(node != head);
      System.out.println("(first node: " + node.value + ")");
    }
  }
}