package foundationsofjava.minilibrarysystem.library;

import foundationsofjava.minilibrarysystem.library.bookformat.Book;
import foundationsofjava.minilibrarysystem.library.bookformat.Fiction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    book1 = new Fiction("Moby Dick", "ID1", 500, Arrays.asList("Author 1", "Author 2"), "fantasy", Arrays.asList("www.google.com", "www.test.com"));
    book1.setTitle("Book Title 1");
    book1.setId("BookID1");
    book1.setPageCount(200);
    book1.setAuthor(Arrays.asList("Author 1", "Author 2"));
    book2 = new Fiction("1984", "ID3", 700, Arrays.asList("Author 1", "Author 2"), "fantasy", Arrays.asList("www.google.com", "www.test.com"));
    book2.setTitle("Book Title 2");
    book2.setId("BookID2");
    book2.setPageCount(300);
    book2.setAuthor(Arrays.asList("Author 3", "Author 4"));
  }

  @Test
  @DisplayName("Add a new book")
  public void testAddBook() {
    library.addBook(book1);
    assertEquals(1, library.getBooks().size());
    assertEquals(book1, library.getBooks().getFirst());
  }

  @Test
  @DisplayName("Check out of a book")
  public void testCheckoutBook(){
    library.checkoutBook(book1);
    assertEquals(0, library.getBooks().size());
  }

  @Test
  @DisplayName("Remove a book")
  public void testRemoveBook() {
    library.addBook(book1);
    library.removeBook(book1);
    assertEquals(0, library.getBooks().size());
  }

  @Test
  @DisplayName("Find a book by title")
  public void testFindBookByTitle() {
    library.addBook(book1);
    library.addBook(book2);
    Book foundBook = library.findBookByTitle("Book Title 1");
    assertEquals(book1, foundBook);
    assertNull(library.findBookByTitle("Nonexistent Title"));
  }

  @Test
  @DisplayName("Get a book")
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
  @DisplayName("Find book by author")
  public void testFindBookByAuthor() {
    library.addBook(book1);
    library.addBook(book2);
    Book foundBook = library.findBookByAuthor("Author 2");
    assertEquals(book1, foundBook);
    assertNull(library.findBookByAuthor("Nonexistent Author"));
  }
}