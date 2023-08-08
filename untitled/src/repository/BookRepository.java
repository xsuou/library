package repository;

import model.Book;

import java.util.ArrayList;


public interface BookRepository {

    void deleteBook(Long id);
    void deleteBook(Book book);
    void saveBook(Book book);
    void updateBook(Book book);
    Book findBookById(Long id);
    ArrayList<Book> getBooks();
}
