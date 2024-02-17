package corejavaconcepts.genericdatastructures.SingleLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleLinkedListTest {

    @Test
    public void testInsert() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insert(5);

        assertNotNull(singleLinkedList.head, "After insertion, head should not be null");
        assertEquals(5, singleLinkedList.head.value, "The inserted value should be as expected");
        assertNull(singleLinkedList.head.next, "Head's next should be null as only one element is inserted");
    }

    @Test
    public void testInsertMultipleValues() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insert(5);
        singleLinkedList.insert(7);
        singleLinkedList.insert(9);

        assertNotNull(singleLinkedList.head, "After insertion, head should not be null");
        assertEquals(5, singleLinkedList.head.value, "The first value inserted should be as expected");
        assertNotNull(singleLinkedList.head.next, "As multiple values are inserted, next of head should not be null");
        assertEquals(7, singleLinkedList.head.next.value, "The second value inserted should be as expected");
        assertEquals(9, singleLinkedList.head.next.next.value, "The third value inserted should be as expected");
        assertNull(singleLinkedList.head.next.next.next, "Only three values are inserted. So, next of the third node should be null");
    }

    @Test
    public void testDisplay() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        // As there are no elements in the list, display should not throw any exceptions
        assertDoesNotThrow(() -> singleLinkedList.display());
    }
}