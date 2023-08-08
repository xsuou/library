package repository;

import model.Author;
import model.Book;

import java.util.ArrayList;

public class BookRepositoryInMemoryImpl implements BookRepository {


    @Override
    public void deleteBook(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                break;

            }
        }

    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book);


    }

    @Override
    public void saveBook(Book book) {
        books.add(book);

    }

    @Override
    public void updateBook(Book book) {
        Book storedBook = findBookById(book.getId());
        storedBook.setAuthor(book.getAuthor());
        storedBook.setTitle(book.getTitle());
        storedBook.setCategory(book.getCategory());
    }

    public Book findBookById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }
}
