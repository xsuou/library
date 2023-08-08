package repository;


import model.Author;

import java.util.ArrayList;

public interface AuthorRepository {


    void deleteAuthor(String name);

    void updateAuthor(Author name);
    ArrayList<Author> getAuthors();


}
