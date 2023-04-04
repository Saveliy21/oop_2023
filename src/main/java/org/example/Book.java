package org.example;

public class Book {

    String title;
    String author;
    Integer yearOfPublication;


    public Integer getYear(){
        return this.yearOfPublication;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }
}
