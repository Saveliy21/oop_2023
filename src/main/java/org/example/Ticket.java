package org.example;

public class Ticket {

    public String hexadecimalNumber;
    public String additions;


    public Ticket(String hexadecimalNumber, String additions){
        this.hexadecimalNumber =hexadecimalNumber;
        this.additions = additions;
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(hexadecimalNumber, 16);
    }
}
