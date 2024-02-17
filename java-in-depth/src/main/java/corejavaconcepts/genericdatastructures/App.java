package corejavaconcepts.genericdatastructures;

import corejavaconcepts.genericdatastructures.CircularLinkedList.CircularLinkedList;
import corejavaconcepts.genericdatastructures.DoubleLinkedList.DoubleLinkedList;
import corejavaconcepts.genericdatastructures.SingleLinkedList.SingleLinkedList;

import java.util.LinkedList;

public class App {
  public static void main(String[] args) {
    SingleLinkedList linkedList = new SingleLinkedList();
    linkedList.insert(10);
    linkedList.insert(20);
    linkedList.display();

    System.out.println();

    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    doubleLinkedList.insert(20);
    doubleLinkedList.insert(30);
    doubleLinkedList.display();

    CircularLinkedList<Integer> list = new CircularLinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.display();


  }
}
