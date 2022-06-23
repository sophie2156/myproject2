package com.sophie.ticket;

public class Discount extends Ticket {
        float soff =0.7f;
        public Discount(Station start, Station destination) {
            super(start, destination);
            price = (int) (price*soff);

        }

    }



