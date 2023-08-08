import model.Author;
import repository.AuthorRepository;

public class AuthorService {

    private AuthorRepository authorRepository;
    private AuthorService authorService;


    public void createAuthor(String name, String aka) {
        Author author = new Author(name);
        author.setName(name);
        author.setAka(name);
    }
public void updateAuthor(String name, String aka) {
        Author author = findAuthorByName(name);
        author.setAka(name);
        author.setName(name);
}

public void deleteAuthor(String name, String aka) {
        authorRepository.getAuthors().remove(findAuthorByName(name));
        authorRepository.getAuthors().remove(findAuthorByAka(aka));
}




public Author findAuthorByName(String name) {

        for (Author author : authorRepository.getAuthors()) {
            if (author.getName().equals(name)) {
                return author;

            }
        }
        return null;

    }
    public Author findAuthorByAka (String aka) {
        for (Author author : authorRepository.getAuthors()) {
            if (author.getAka().equals(aka)) {
                return author;
            }
        }
        return null;
    }
}
