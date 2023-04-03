package org.example;

public class Book {

    String title;
    String author;
    Integer yearOfPublication;

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if (! (o instanceof Book)){
            return false;
        }
        Book book = (Book) o;
        return book.yearOfPublication.equals(yearOfPublication) &&
                book.title.equals(title) &&
                book.author.equals(author);
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + yearOfPublication;
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (author == null ? 0 : author.hashCode());
        return hash;
    }
}
