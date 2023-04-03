package org.example;

import java.util.*;

public class library {


    /*
       Я очень долго мучался с выбором более сложной коллекции, но у меня
       возникали большие трусдности с реализацией методов поиска, поэтому я решил
       обратиться к листам, выбор пал на LinkedList т.к. к элементам по индексу мы почти не обращаемся
       а вставка/ удаление будет происходить чаще и быстрее засчёт двусвязного списка.
       сами же операции будут проходить за O(n) т.к. в каждом методе мы итерируемся по коллекции до n-го элемента.
       последний метод getFromIntervalOfPublic тоже будет за O(n) т.к. я сделал сортировку по годам.
     */
    public List<Book> library = new LinkedList<>();

    public void addBook(Book book){
        library.add(book);
        library.sort(Comparator.comparing(Book::getYear));
    }

    public void removeBook(Book book){
        library.remove(book);
    }

    public List<Book> getFromTitle(String title){
        List<Book> result =  new LinkedList<>();
        for(Book book : library){
            if(Objects.equals(book.title, title)){
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getFromAuthor(String author){
        List<Book> result =  new LinkedList<>();
        for(Book book : library){
            if(Objects.equals(book.author, author)){
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getFromYear(Integer year){
        List<Book> result =  new LinkedList<>();
        for(Book book : library){
            if(Objects.equals(book.getYear(), year)){
                result.add(book);
            }
        }
        return result;
    }

    // выдаст все книги [start;end], где start - начальный год, end - конечный
    public List<Book> getFromIntervalOfPublic(int start, int end){
        List<Book> result = new LinkedList<>();
        for(Book book : library){
            if(book.getYear() >= start){
                result.add(book);
            }
            if(book.getYear() > end)
                break;
        }
        return result;
    }
}
