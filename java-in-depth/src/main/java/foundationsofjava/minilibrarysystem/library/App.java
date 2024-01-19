package foundationsofjava.minilibrarysystem.library;

import java.util.ArrayList;
import java.util.List;
import foundationsofjava.minilibrarysystem.library.Library;
import foundationsofjava.minilibrarysystem.library.Book;

public class App {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library();

        // Create new books
        List<String> authors = new ArrayList<>();
        authors.add("Author Name");
        Book book1 = new Book("Moby Dick", "ID1", 500, authors);
        Book book2 = new Book("To Kill a Mockingbird", "ID2", 400, authors);
        Book book3 = new Book("1984", "ID3", 700, authors);

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // List all books in library
        List<Book> books = library.getBooks();
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}