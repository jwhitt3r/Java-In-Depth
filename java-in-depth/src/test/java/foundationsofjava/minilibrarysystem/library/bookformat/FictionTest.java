package foundationsofjava.minilibrarysystem.library.bookformat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FictionTest {

  /**
  * This class tests the Fiction class and its methods getSubGenre() and setSubGenre().
  * getSubGenre() - the method returns the subgenre of a Fiction book. 
  * setSubGenre(String subGenre) - the method sets the subgenre of a Fiction book using the given subGenre parameter.
  */
  Fiction fiction;
  @BeforeEach
  public void setUp(){
    List<String> authors = new ArrayList<>();
    List<String> coverURL = new ArrayList<>();
    coverURL.add("www.google.com");
    authors.add("Author 1");
    fiction = new Fiction("Title", "1", 200, authors, "Horror", coverURL);
  }

  @Test
  @DisplayName("Get sub genre of book")
  public void testGetSubGenre() {
    assertEquals("Horror", this.fiction.getSubGenre(), "Asserting getSubGenre for Fiction");
  }

  @Test
  @DisplayName("Set sub genre of book")
  public void testSetSubGenre() {
    fiction.setSubGenre("Mystery");
    assertEquals("Mystery", fiction.getSubGenre(), "Asserting getSubGenre for Fiction after subGenre has been set");
  }

  @Test
  @DisplayName("Add cover image url")
  public void testAddCoverURL() {
    fiction.addCoverURL("https://example.com/cover.jpg");
    assertEquals("https://example.com/cover.jpg", fiction.getCoverURLs().getLast(), "Asserting getCoverURL for Fiction after a cover url has been added");
  }

  @Test
  @DisplayName("Remove cover image url")
  public void testRemoveCoverURL() {
    fiction.addCoverURL("https://example.com/cover.jpg");
    assertTrue(fiction.removeCoverURL("https://example.com/cover.jpg"), "Asserting removeCoverURL for Fiction after a cover url has been added");
  }

  @Test
  @DisplayName("Check to see if the objects are the same")
  void testEqualsSameObject() {
    List<String> authors = List.of("Author 1");
    Fiction fiction1 = new Fiction("Title", "Id", 123, authors, "Subgenre",
            List.of("URL 1"));
    // same object should be regarded as equal
    assertEquals(fiction1, fiction1);
  }

  @Test
  @DisplayName("Check to see if the two objects are of different classes")
  void testEqualsDifferentClass() {
    List<String> authors = List.of("Author 1");
    List<String> URLs = List.of("URL 1");
    Fiction fiction1 = new Fiction("Title", "Id", 123, authors, "Subgenre",
            URLs);
    // number is of a different class, should not be regarded as equal
    assertNotEquals(123, fiction1);
  }

  @Test
  @DisplayName("Check if the different object have the same values")
  void testEqualsSameValuesDifferentObjects() {
    List<String> authors = List.of("Author 1");
    List<String> URLs = List.of("URL 1");
    Fiction fiction1 = new Fiction("Title", "Id", 123, authors, "Subgenre",
            URLs);
    Fiction fiction2 = new Fiction("Title", "Id", 123, authors, "Subgenre",
            URLs);
    // two different objects but with the same values should be regarded as equal
    assertFalse(fiction1.equals(fiction2));
  }

  @Test
  @DisplayName("Check if the objects have two different values")
  void testEqualsDifferentValues() {
    List<String> authors1 = List.of("Author 1");
    List<String> authors2 = List.of("Author 2");
    Fiction fiction1 = new Fiction("Title", "Id", 123, authors1, "Subgenre",
            List.of("URL 1"));
    Fiction fiction2 = new Fiction("New Title", "New Id", 456, authors2, "New Subgenre",
            List.of("URL 2"));
    // two objects with different values should not be regarded as equal
    assertNotEquals(fiction1, fiction2);
  }

  @Test
  @DisplayName("Check if the object is null")
  void testEqualsNull() {
    List<String> authors = List.of("Author 1");
    List<String> URLs = Arrays.asList("URL 1", "URL 2");
    Fiction fiction1 = new Fiction("Title", "Id", 123, authors, "Subgenre",
            URLs);
    // compared to null should not be regarded as equal
    assertNotEquals(null, fiction1);
  }

  @Test
  @DisplayName("Check to see if the cover URL can be modified")
  void testModifyCoverURL() {
    String initialCoverURL = "www.google.com";
    String modifiedCoverURL = "http://example.com/modifiedCover.jpg";

    // Assert that the coverURLs list initially has the initialCoverURL
    assertTrue(fiction.getCoverURLs().contains(initialCoverURL));
    assertFalse(fiction.getCoverURLs().contains(modifiedCoverURL));

    // Call the method to be tested
    fiction.modifyCoverURL(initialCoverURL, modifiedCoverURL);

    // Assert that the coverURLs list now has the modifiedCoverURL and not the initialCoverURL
    assertFalse(fiction.getCoverURLs().contains(initialCoverURL));
    assertTrue(fiction.getCoverURLs().contains(modifiedCoverURL));
  }

}