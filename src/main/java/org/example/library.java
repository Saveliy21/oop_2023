package org.example;

import java.util.*;

public class library {


    public Map<Book, Integer> library = new LinkedHashMap<>();

    public Set<Book> lib = new LinkedHashSet<>();


    public void addBook(Book book){
        library.put(book, book.hashCode());
    }

    public void removeBook(Book book){
        library.remove(book);
    }

    public List<Book> getFromTitle(String title){

    }

    public Book getFromAuthor(String author){

    }

    public Book getFromYear(Integer year){

    }

    public Book getFromIntervalOfPublic(){

    }
}
