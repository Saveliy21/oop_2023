package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bar {

    /* Я выбрал именно HashMap, потому что добавление и получение элементов у нас работают за O(1),
     при условии, что хэш функция определена нормально.
     Я определил её в классе Ticket как сам номер билета, переведённый в 10-тичную запись.
     Не уверен насчёт корректности самой map и класса Ticket, но у меня были мысли такие, что
     в классе Ticket у нас может быть много различных полей, например: время и дата покупки, Id кассира и многое другое.
     А поскольку нас интересуют только сам номер билета и доп. продукты к нему на баре,
     мы заводим map только с этими полями.
    */
    public Map<String,String> tickets = new HashMap<>();

    public void addVisitors(String hexadecimalNumber, String additions){
        Ticket ticket = new Ticket(hexadecimalNumber, additions);
        tickets.put(ticket.hexadecimalNumber, ticket.additions);
    }
    public String getProduct(String number){
        return tickets.get(number);
    }
}
