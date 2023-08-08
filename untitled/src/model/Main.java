package model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList();

        Book book1 = new Book();
        Author author1 = new Author("Tolkien");
        book1.setAuthor(author1);
        book1.setTitle("Lotr");
        Category category1 = new Category("Fantasy");
        book1.setCategory(category1);
        PhysicalCopy copies1 = new PhysicalCopy("available", "");
        PhysicalCopy copies2 = new PhysicalCopy("available", "");
        PhysicalCopy copies3 = new PhysicalCopy("available", "");



        book1.getCopies().add(copies1);
        book1.getCopies().add(copies2);
        book1.getCopies().add(copies3);

        Book book2 = new Book();
        Author author2 = new Author("ktostam");
        book2.setAuthor(author2);

        Book book3 = new Book();

        User user1 = new User();
        user1.setName("Kamil");
        user1.setEmail("ayaya@gmail.com");
        //user1.setRole(UserRole); //rola usera jako clasa?
        user1.setBooks("jakies"); // ksiazki jakie ma tytuly i autor(?)
        user1.setStatus("x"); // czy ma jakies ksiazki
        user1.setPassword("pass"); //to w mhash? ale to juz chyba trzeba na springu
        user1.setId(123); // id musze jakos nadac?

        //System.out.println(book1.copies.size());
        System.out.println(user1);

    }
}