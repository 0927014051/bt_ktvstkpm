package org.example;

public class Book implements Comparable<Book>{
    private String title;
    private String artist;
    private int price;

    public Book(String title, String artist, int price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Book) {
            Book otherBook = (Book) other;
            return this.title.equals(otherBook.title);
        } else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }
}
