package corejavaconcepts.genericdatastructures.CircularLinkedList;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularLinkedListTest {

    @Test
    public void testInsert() {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.add(5);

        assertNotNull(circularLinkedList.head, "After insertion, head should not be null");
        assertEquals(5, circularLinkedList.head.value, "The inserted value should be as expected");
        assertNotNull(circularLinkedList.head.next, "Head's next should not be null as only one element is inserted and will pointing to itself");
    }
    @Test
    public void testMultipleInserts() {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.add(5);
        circularLinkedList.add(6);
        circularLinkedList.add(7);

        assertNotNull(circularLinkedList.head, "After insertion, head should not be null");
        assertEquals(5, circularLinkedList.head.value, "The inserted value should be as expected");
        assertEquals(6, circularLinkedList.head.next.value, "The second value inserted should be as expected");
        assertEquals(7, circularLinkedList.head.next.next.value, "The third value inserted should be as expected");
        assertNotNull(circularLinkedList.head.next, "Head's next should be null as only one element is inserted");
    }

    @Test
    public void testDisplay() {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();

        // As there are no elements in the list, display should not throw any exceptions
        assertDoesNotThrow(() -> circularLinkedList.display());
    }
}