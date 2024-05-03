package org.example.factory;

public class MainFactory {
    public static void main(String[] args) {
        OnlineStoreFactory factory = new BookFactory();
        Book book1 = factory.createBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        Book book2 = factory.createBook("Java Programming", "John Doe", 29.99);
        book1.displayInfo();
        book2.displayInfo();
    }
}
