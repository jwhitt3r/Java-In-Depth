package foundationsofjava.minilibrarysystem.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Represents a test class for the Book class.
 */
class BookTest {

  Book book;
  String id = "123";
  String title = "The Great Book";
  int pageCount = 100;
  List<String> authors = Arrays.asList("Author1", "Author2");

  @BeforeEach
  public void setUp() {
    book = new Fiction("Moby Dick", "ID1", 500, authors, "fantasy");
  }

  @Test
  public void testId() {
    book.setId(id);
    assertEquals(id, book.getId());
  }

  @Test
  public void testTitle() {
    book.setTitle(title);
    assertEquals(title, book.getTitle());
  }

  @Test
  public void testPageCount() {
    book.setPageCount(pageCount);
    assertEquals(pageCount, book.getPageCount());
  }

  @Test
  public void testAuthor() {
    book.setAuthor(authors);
    assertEquals(authors, book.getAuthor());
  }

  @Test
  public void testToString() {
    book.setId(id);
    book.setTitle(title);
    book.setPageCount(pageCount);
    book.setAuthor(authors);

    String expected = "Book{title='" + title
            + "', id='" + id
            + "', pageCount=" + pageCount
            + ", author=" + authors
            + '}';
    assertEquals(expected, book.toString());
  }
}