package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bar{

    /* Я выбрал именно HashMap, потому что добавление и получение элементов у нас работают за O(1),
     при условии, что хэш функция определена нормально, если я прав, то тут мы сраваниваем строки, а для String метод
     equals() уже переопределён, а значит и hashCode() тоже (по идее).
    */
    public Map<String,String> tickets = new HashMap<>();

    public void addVisitor(String hexadecimalNumber, String additions){
        tickets.put(hexadecimalNumber, additions);
    }

    public String getProduct(String number){
        return tickets.get(number);
    }
}
