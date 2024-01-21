package foundationsofjava.minilibrarysystem.library.bookformat;

import java.util.List;

public class Fiction extends Book {

  /**
   * Represents the subgenre of a Fiction book.
   */
  private String subGenre;
  /**
   * Represents a list of cover URLs for a Fiction book.
   */
  private final List<String> coverURLs;

  /**
   * Creates a Book object with the given title, id, pageCount, and author.
   *
   * @param title     the title of the book
   * @param id        the unique identifier of the book
   * @param pageCount the number of pages in the book
   * @param author    a list of strings representing the author(s) of the book
   */
  public Fiction(String title, String id, int pageCount, List<String> author, String subGenre, List<String> coverURLs) {
    super(title, id, pageCount, author);
    this.subGenre = subGenre;
    this.coverURLs = coverURLs;
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

  /**
   * Retrieves the list of cover URLs for a Fiction book.
   *
   * @return A list of strings representing the cover URLs for the Fiction book.
   */
  public List<String> getCoverURLs() {
    return this.coverURLs;
  }

  /**
   * Adds a cover URL to the list of cover URLs for the Fiction book.
   *
   * @param url The URL of the cover image to be added.
   */
  public void addCoverURL(String url) {
    this.coverURLs.add(url);
  }

  /**
   * Removes a cover URL from the list of cover URLs for the Fiction book.
   *
   * @param url The URL of the cover image to be removed.
   * @return true if the cover URL was successfully removed, false otherwise.
   */
  public boolean removeCoverURL(String url) {
    return this.coverURLs.remove(url);
  }

  /**
   * Modify a cover URL
   *
   * @param oldUrl The URL of the cover image to be replaced
   * @param newUrl The new URL of the cover image
   * @return true if the cover URL was successfully modified, false otherwise.
   */
  public boolean modifyCoverURL(String oldUrl, String newUrl) {
    int index = this.coverURLs.indexOf(oldUrl);
    if (index != -1) {
      this.coverURLs.set(index, newUrl);
      return true;
    }
    return false;
  }

}
