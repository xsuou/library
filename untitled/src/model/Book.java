package model;

import java.util.ArrayList;

public class Book {

    Long id;
    String title;
    Author author;
    Category category;
    ArrayList<PhysicalCopy> copies = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public ArrayList<PhysicalCopy> getCopies() {
        return copies;
    }

    public void setCopies(ArrayList<PhysicalCopy> copies) {
        this.copies = copies;
    }






}
