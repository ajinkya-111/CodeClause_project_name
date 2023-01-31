package com.company;

import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library{
     public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books =  books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library.");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library." + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned to the library.");
        this.books.add(b);
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("The Alchemist", "Paulo Coelho" );
      bk.add(b1);

        Book b2 = new Book("Mockingbird", "Kathryn Erskine" );
      bk.add(b2);

      Book b3 = new Book("Ikigai", "Fransec Miralles" );
      bk.add(b3);

      Book b4 = new Book("Harry Potter", "J.k. Rowling" );
      bk.add(b4);

      Library L = new Library(bk);
      L.addBook(new Book("History","myAuthor"));
        System.out.println(L.books);
        L.issueBook(b3, "Ajinkya");
        System.out.println(L.books);
    }
}
