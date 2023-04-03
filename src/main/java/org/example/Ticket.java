package org.example;

public class Ticket {

    public String hexadecimalNumber;
    public String additions;


    public Ticket(String hexadecimalNumber, String additions){
        this.hexadecimalNumber =hexadecimalNumber;
        this.additions = additions;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Ticket)){
            return  false;
        }
        Ticket ticket = (Ticket)o;
        return ticket.hexadecimalNumber.equals(hexadecimalNumber) && ticket.additions.equals(additions);
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(hexadecimalNumber, 16);
    }
}
