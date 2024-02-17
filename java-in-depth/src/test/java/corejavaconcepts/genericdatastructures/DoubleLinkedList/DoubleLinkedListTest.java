package corejavaconcepts.genericdatastructures.DoubleLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleLinkedListTest {
  @Test
  public void testInsert() {
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    doubleLinkedList.insert(5);

    assertNotNull(doubleLinkedList.head, "After insertion, head should not be null");
    assertEquals(5, doubleLinkedList.head.value, "The inserted value should be as expected");
    assertNull(doubleLinkedList.head.next, "Head's next should be null as only one element is inserted");
  }
  @Test
  public void testMultipleInserts() {
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    doubleLinkedList.insert(5);
    doubleLinkedList.insert(6);
    doubleLinkedList.insert(7);

    assertNotNull(doubleLinkedList.head, "After insertion, head should not be null");
    assertEquals(5, doubleLinkedList.head.value, "The inserted value should be as expected");
    assertEquals(6, doubleLinkedList.head.next.value, "The second value inserted should be as expected");
    assertEquals(7, doubleLinkedList.head.next.next.value, "The third value inserted should be as expected");
    assertNotNull(doubleLinkedList.head.next, "Head's next should be null as only one element is inserted");
  }

  @Test
  public void testDisplay() {
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

    // As there are no elements in the list, display should not throw any exceptions
    assertDoesNotThrow(() -> doubleLinkedList.display());
  }
}
