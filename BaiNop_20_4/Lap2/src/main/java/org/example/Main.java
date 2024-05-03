package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>(Arrays.asList(
                new Book("Anna Karenina", "Lev Nikolayevich Tolstoy", 100000),
                new Book("Lolita", "Vladimir Nabokov", 200000),
                new Book("Jane Eyre", "Charlotte Bronte", 300000),
                new Book("Harry Potter series", "JK Rowling", 400000),
                new Book("Wuthering Heights", "Emily Bronte", 500000),
                new Book("His Dark Materials", "Philip Pullman", 600000),
                new Book("Little Women", "Louisa M. Alcott", 700000),
                new Book("Tess of the D'Urbervilles", "Thomas Hardy", 700000),
                new Book("Catch 22", "Joseph Heller", 800000)
        ));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Nhập tên sách: ");
            String name = sc.nextLine();
            Book book = new Book(name, "",  0);
            System.out.println("1. Binary Search");
            System.out.println("2. Linear Search");
            System.out.print("Chọn thuật toán: ");
            int viTri = sc.nextInt();
            sc.nextLine();
            System.out.println("Kết quả: ");
            int index;
            switch(viTri){
                case 1:
                    ArrayList<Book> listBook = (ArrayList<Book>) bookList.clone();
                    Collections.sort(listBook);
                    index = new BinarySearch().search(listBook, book );
                    if(index == -1){
                        System.out.println("Không tìm thấy sách");
                    } else{
                        System.out.println("Vị trí: " + index);
                        System.out.println("Sách: " + listBook.get(index));
                    }
                    break;
                case 2:
                    index = new LinearSearch().search(bookList, book );
                    if(index == -1){
                        System.out.println("Không tìm thấy sách");
                    } else{
                        System.out.println("Vị trí: " + index);
                        System.out.println("Sách: " + bookList.get(index));
                    }
                    break;
            }
        }

    }
}