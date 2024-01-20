package foundationsofjava.minilibrarysystem.library;

import java.util.List;

/**
 * Represents a book.
 */
public abstract class Book {
  /**
   * Represents the title of a book.
   */
  public String title;

  /**
   * Represents an identifier for a book.
   * The id variable is used to uniquely identify a book. This variable stores the identifier as a string.
   *
   * @see Book
   */
  public String id;
  /**
   * Represents the number of pages in a book.
   */
  public int pageCount;

  /**
   *
   */
  public List<String> author;

  /**
   * Creates a Book object with the given title, id, pageCount, and author.
   *
   * @param title     the title of the book
   * @param id        the unique identifier of the book
   * @param pageCount the number of pages in the book
   * @param author    a list of strings representing the author(s) of the book
   */
  public Book(String title, String id, int pageCount, List<String> author) {
    this.title = title;
    this.id = id;
    this.pageCount = validatePageCount(pageCount);
    this.author = author;
  }

  /**
   * Checks if pageCount is a positive integer
   *
   * @param pageCount number of pages in the book
   */
  private int validatePageCount(int pageCount) {
    if (pageCount <= 0) {
      throw new IllegalArgumentException("Page count must be a positive integer.");
    }
    return pageCount;
  }

  /**
   * Retrieves the title of the book.
   *
   * @return The title of the book.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of the book.
   *
   * @param title the new title of the book
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Returns the id of the book.
   *
   * @return The id of the book as a string.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the unique identifier of the book.
   *
   * @param id the unique identifier to be set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Returns the page count of the book.
   *
   * @return the page count of the book
   */
  public int getPageCount() {
    return pageCount;
  }

  /**
   * Sets the page count of the book.
   *
   * @param pageCount the new page count to be set
   */
  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  /**
   * Retrieves the list of authors of the book.
   *
   * @return The list of authors of the book.
   */
  public List<String> getAuthor() {
    return author;
  }

  /**
   * Sets the author(s) of the book.
   *
   * @param author A list of strings representing the author(s) of the book. Can be null.
   */
  public void setAuthor(List<String> author) {
    this.author = author;
  }

  /**
   * Returns a string representation of a Book object.
   * This method concatenates the values of the title, id, pageCount, and author properties
   * of the Book object into a single string, formatted as follows:
   * <p>
   * Book{title='[title]', id='[id]', pageCount=[pageCount], author=[author]}
   * <p>
   * where [title] is the value of the title property, [id] is the value of the id property,
   * [pageCount] is the value of the pageCount property, and [author] is the value of the
   * author property, formatted as an array string.
   *
   * @return a string representation of the Book object.
   */
  @Override
  public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", id='" + id + '\'' +
            ", pageCount=" + pageCount +
            ", author=" + author +
            '}';
  }
}
