package org.example.factory;

interface OnlineStoreFactory {
    Book createBook(String title, String author, double price);
}