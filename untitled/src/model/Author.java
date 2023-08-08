package model;

import java.util.ArrayList;

public class Author {
    String name;
    String aka;

    public String getName() {
        return name;
    }
    public String getAka() {return aka;}

    public void setName(String name) {
        this.name = name;
    }

    public void setAka(String aka) {
        this.aka = aka;
    }

    public Author(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
