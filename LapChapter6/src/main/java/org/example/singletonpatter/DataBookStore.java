package Singleton;

import java.util.ArrayList;
import java.util.List;

public class DataBookStore {
    private List<Book> books;
    private static Singleton.DataBookStore instance = null;
    public DataBookStore(){
        books = new ArrayList<>();
        System.out.println("Init data book store");
    }
    public static Singleton.DataBookStore getInstance(){
        if (instance == null){
            instance = new Singleton.DataBookStore();
        }
        return instance;
    }
    public List<Book> getBooks(){
        return books;
    }
    public void setBooks(List<Book> books){
        this.books = books;
    }
    public void add(Book book){
        this.books.add(book);
    }
    public boolean delete(int id){
        int index = -1;
        for (int i = 0; i < books.size(); i++) {
            if (this.books.get(i).getId() == id){
                index = i;
                break;
            }
        }
        if (index == -1){
            return false;
        }
        books.remove(index);
        return true;
    }
    public boolean update(int id){
        int index = -1;
        for (int i = 0; i < books.size(); i++) {
            if (this.books.get(i).getId() == id){
                index = i;
                break;
            }
        }
        if (index == -1){
            return false;
        }
        books.get(index).setName(String.valueOf(index));
        return true;
    }
    public void show(int id){
        this.books.forEach(book -> System.out.println(book.toString()));
    }
}
