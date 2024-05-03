package org.example.factory;

class BookFactory implements OnlineStoreFactory {
    @Override
    public Book createBook(String title, String author, double price) {
        if (title.startsWith("A") || title.startsWith("The")) {
            return new FictionBook(title, author, price);
        } else {
            return new NonFictionBook(title, author, price);
        }
    }
}
