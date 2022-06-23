package com.sophie.ticket;

public class Ticket {
    public static final int RAINBOW = 50;
    public static final int PONY = 50;
    public static final int METEOR = 50;
    Station start;
    Station destination;
    int price;
    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;

            if (start == Station.RAINBOW) {
                if (destination == Station.PONY) {
                    price = 50;
                } else {
                    price = 100;
                }
            } else if (start == Station.PONY) {
                if (destination == Station.RAINBOW) {
                    price = 50;
                } else {
                    price = 50;
                }
            } else if (start == Station.METEOR) {
                if (destination == Station.PONY) {
                    price = 50;
                } else {
                    price = 100;
                }
        }





    }public void print() {
        System.out.println(start.name + "\t" + destination.name + "\t" + price );}
}
