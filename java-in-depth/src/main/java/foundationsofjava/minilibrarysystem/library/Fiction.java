package foundationsofjava.minilibrarysystem.library;

import java.util.List;

public class Fiction extends Book {

  public String subGenre;

  /**
   * Creates a Book object with the given title, id, pageCount, and author.
   *
   * @param title     the title of the book
   * @param id        the unique identifier of the book
   * @param pageCount the number of pages in the book
   * @param author    a list of strings representing the author(s) of the book
   */
  public Fiction(String title, String id, int pageCount, List<String> author, String subGenre) {
    super(title, id, pageCount, author);
    this.subGenre = subGenre;
  }

  /**
   * Retrieves the subgenre of a Fiction book.
   *
   * @return The subgenre of the Fiction book.
   */
  public String getSubGenre() {
    return subGenre;
  }

  /**
   * Sets the subgenre of a Fiction book.
   * <p>
   * This method sets the subgenre of a Fiction book using the given subGenre parameter.
   *
   * @param subGenre A string representing the subgenre of the Fiction book.
   */
  public void setSubGenre(String subGenre) {
    this.subGenre = subGenre;
  }
}
