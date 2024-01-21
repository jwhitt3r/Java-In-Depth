package foundationsofjava.minilibrarysystem.library;

import foundationsofjava.minilibrarysystem.library.bookformat.Book;
import foundationsofjava.minilibrarysystem.library.bookformat.Fiction;

import java.util.Collections;
import java.util.List;

public class App {

  private static final Library library = new Library();

  public static void main(String[] args) {
    // Create new books and add them to the library
    createBook("Moby Dick", "ID1", 500, "fantasy");
    createBook("To Kill a Mockingbird", "ID2", 400, "fantasy");
    createBook("1984", "ID3", 700, "children");
    // List all books in library
    List<Book> books = library.getBooks();
    for (Book book : books) {
      System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
    }
  }

  public static void createBook(String title, String id, int pageCount, String genre) {
    List<String> authors = Collections.singletonList("Author Name");
    List<String> coverURLS = Collections.singletonList("www.google.com");
    Book newBook = new Fiction(title, id, pageCount, authors, genre, coverURLS);
    library.addBook(newBook);
  }
}