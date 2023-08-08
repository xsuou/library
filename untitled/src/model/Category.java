package model;

public class Category {

    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Category(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
