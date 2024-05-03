package org.example.factory;

class FictionBook extends Book {
    public FictionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book - Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}
