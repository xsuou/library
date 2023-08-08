package repository;
import model.Author;
import java.util.ArrayList;
public class AuthorRepositoryInMemoryImpl implements AuthorRepository {




    public void deleteAuthor(String name){
        for(Author author : authors){
            if (author.getName().equals(name)){
                authors.remove(author);
                break;
            }
        }
    }
    public void updateAuthor(Author author) {
        authors.add(author);
    }

    ArrayList<Author> authors = new ArrayList<>();

    public ArrayList<Author> getAuthors() {return authors;}
}
