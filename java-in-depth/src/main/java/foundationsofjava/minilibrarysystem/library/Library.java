package foundationsofjava.minilibrarysystem.library;

import foundationsofjava.minilibrarysystem.library.bookformat.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a library that contains a collection of books.
 */
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


  /**
   * Removes a book from the library.
   *
   * @param book the book to be removed
   */
  public void removeBook(Book book) {
    books.remove(book);
  }

  /**
   * Finds a book in the library by its title.
   *
   * @param bookTitle the title of the book to search for
   * @return the Book object with the matching title, or null if no match is found
   */
  public Book findBookByTitle(String bookTitle) {
    for (Book book : books) {
      if (book.getTitle().equals(bookTitle)) {
        return book;
      }
    }
    return null;
  }

  /**
   * Retrieves a list of books from the library.
   *
   * @return a list of books from the library
   */
  public List<Book> getBooks() {
    return Collections.unmodifiableList(this.books);
  }

  /**
   * Finds a book in the library by author.
   *
   * @param author The author of the book to search for.
   * @return The first book found with the given author, or null if no book is found.
   */
  public Book findBookByAuthor(String author) {
    for (Book book : books) {
      if (book.getAuthor().contains(author)) {
        return book;
      }
    }
    return null;
  }

  /**
   * Removes a book from the library by checking it out.
   *
   * @param book1 the book to be checked out and removed
   */
  public void checkoutBook(Book book1) {
    books.remove(book1);
  }
}
