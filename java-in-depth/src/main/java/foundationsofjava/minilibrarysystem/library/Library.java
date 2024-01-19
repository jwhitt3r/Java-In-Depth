package foundationsofjava.minilibrarysystem.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

  /* What functionality do we want in a library?
   * find a book
   * add a book
   * checking out a book
   * return a book
   * inventory of books
   */
  public final List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(Book book) {
    books.remove(book);
  }

  public Book findBookByTitle(String bookTitle) {
    for (Book book : books) {
      if (book.getTitle().equals(bookTitle)) {
        return book;
      }
    }
    return null;
  }

  public List<Book> getBooks() {
    return Collections.unmodifiableList(this.books);
  }

  public Book findBookByAuthor(String author) {
    for (Book book : books) {
      if (book.getAuthor().contains(author)) {
        return book;
      }
    }
    return null;
  }
}
