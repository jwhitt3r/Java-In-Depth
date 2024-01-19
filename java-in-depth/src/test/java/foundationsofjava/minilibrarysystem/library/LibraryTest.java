package foundationsofjava.minilibrarysystem.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryTest {
  Library library;
  Book book1;
  Book book2;

  @BeforeEach
  public void setUp() {
    library = new Library();
    book1 = new Book("Moby Dick", "ID1", 500, Arrays.asList("Author 1", "Author 2"));
    book1.setTitle("Book Title 1");
    book1.setId("BookID1");
    book1.setPageCount(200);
    book1.setAuthor(Arrays.asList("Author 1", "Author 2"));
    book2 = new Book("1984", "ID3", 700, Arrays.asList("Author 1", "Author 2"));
    book2.setTitle("Book Title 2");
    book2.setId("BookID2");
    book2.setPageCount(300);
    book2.setAuthor(Arrays.asList("Author 3", "Author 4"));
  }

  @Test
  public void testAddBook() {
    library.addBook(book1);
    assertEquals(1, library.getBooks().size());
    assertEquals(book1, library.getBooks().getFirst());
  }

  @Test
  public void testRemoveBook() {
    library.addBook(book1);
    library.removeBook(book1);
    assertEquals(0, library.getBooks().size());
  }

  @Test
  public void testFindBookByTitle() {
    library.addBook(book1);
    library.addBook(book2);
    Book foundBook = library.findBookByTitle("Book Title 1");
    assertEquals(book1, foundBook);
    assertNull(library.findBookByTitle("Nonexistent Title"));
  }

  @Test
  public void testGetBooks() {
    library.addBook(book1);
    library.addBook(book2);
    List<Book> expectedBooks = Arrays.asList(book1, book2);
    assertEquals(expectedBooks, library.getBooks());
    // Test that the book list cannot be modified outside Library class
    boolean thrown = false;
    try {
      library.getBooks().add(book1);
    } catch (UnsupportedOperationException e) {
      thrown = true;
    }
    assertTrue(thrown);
  }

  @Test
  public void testFindBookByAuthor() {
    library.addBook(book1);
    library.addBook(book2);
    Book foundBook = library.findBookByAuthor("Author 2");
    assertEquals(book1, foundBook);
    assertNull(library.findBookByAuthor("Nonexistent Author"));
  }
}