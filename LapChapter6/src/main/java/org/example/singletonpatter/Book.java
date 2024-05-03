package org.example.singletonpatter;

public abstract class Book {
    protected int id;
    protected String name;
    protected int catId;

    public Book() {
    }

    public Book(int id, String name, int catId) {
        this.id = id;
        this.name = name;
        this.catId = catId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name +
                ", catId=" + catId +
                '}';
    }
}
