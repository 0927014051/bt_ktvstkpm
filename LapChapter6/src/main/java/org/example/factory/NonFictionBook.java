package org.example.factory;

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction Book - Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}