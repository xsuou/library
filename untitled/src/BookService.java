import model.Book;
import model.CategoryService;
import model.PhysicalCopy;
import repository.BookRepository;

import java.util.ArrayList;

public class BookService {

    private BookRepository bookRepository;
    private AuthorService authorService;
    private CategoryService categoryService;

    public void createBook(String title, String author, String category, int copies) {
        Book book = new Book();
        book.setAuthor(authorService.findAuthorByName(author));
        book.setTitle(title);
        book.setCategory(categoryService.findCategoryByName(category));
        ArrayList<PhysicalCopy> physicalCopies = new ArrayList<>();
        for (int index = 0; index < copies; index++) {
            physicalCopies.add(new PhysicalCopy("available", null));
        }
        book.setCopies(physicalCopies);


    }

    public Book findBookById(Long id) {
        return bookRepository.findBookById(id);

    }

    public void deleteBook(Long id) {
        bookRepository.deleteBook(id);
    }


}
