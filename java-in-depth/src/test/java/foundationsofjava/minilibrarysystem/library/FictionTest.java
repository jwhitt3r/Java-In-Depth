package foundationsofjava.minilibrarysystem.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FictionTest {
  private Fiction book;
  private static final String INITIAL_SUBGENRE = "Mystery";
  private static final String UPDATED_SUBGENRE = "Thriller";

  @BeforeEach
  void setUp() {
    List<String> authors = Arrays.asList("John Doe", "Jane doe");
    book = new Fiction("Title", "123", 100, authors, INITIAL_SUBGENRE);
  }

  @Test
  @DisplayName("Test getSubGenre method")
  void testGetSubGenre() {
    assertEquals(INITIAL_SUBGENRE, book.getSubGenre(), "Failed to get subgenre correctly");
  }

  @Test
  @DisplayName("Test setSubGenre method")
  void testSetSubGenre() {
    book.setSubGenre(UPDATED_SUBGENRE);
    assertEquals(UPDATED_SUBGENRE, book.getSubGenre(), "Failed to set subgenre correctly");
  }
}