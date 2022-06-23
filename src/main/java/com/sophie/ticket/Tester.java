package com.sophie.ticket;

import java.util.Scanner;
import java.util.ArrayList;

public class Tester {

    public static void main(String[] args){
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
        int i=1;
        while (i==1){
        Scanner scanner=new Scanner(System.in);
        System.out.println("您的起始站？(1:彩虹國,(2:小馬國,(3:流星國");
        int choice = Integer.parseInt(scanner.next());
        Station start=null;
        switch (choice){
            case 1:
                start =Station.RAINBOW;
                break;
            case 2:
                start =Station.PONY;
                break;
            case 3:
                start =Station.METEOR;
                break;

        }
        System.out.println("您的結束站？(1:彩虹國,(2:小馬國,(3:流星國");
        choice = Integer.parseInt(scanner.next());
        Station destination=null;
        switch (choice){
            case 1:
                destination =Station.RAINBOW;

                break;
            case 2:
                destination =Station.PONY;
                break;
            case 3:
                destination =Station.METEOR;
                break;
    }
        if (start==destination){
            System.out.println("同站不可訂購");
            break;}

        System.out.println("請問要哪種票？(1:全票,(2:學生票,(3:敬老票,(4:小孩票");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch(choice) {
            case 1:
                ticket = new Ticket(start, destination);
                break;
            case 2:
                ticket = new Discount(start,destination);
                break;
            case 3:
                ticket = new Discountold(start,destination);
                break;
            case 4:
                ticket = new Discountold(start,destination);
                break;
         }

            Scanner scanner2=new Scanner(System.in);
            System.out.println("這樣一張是"+ ticket.price+"元,"+"請問要幾張票？(1,(2,(3,(4,(5");
            int choice2 = Integer.parseInt(scanner2.next());
            switch(choice2) {
                case 1:
                    ticket.price= ticket.price*1;
                    arrlist1.add(ticket.price);
                    arrlist.add(1);
                    break;
                case 2:
                    ticket.price = ticket.price*2;
                    arrlist1.add(ticket.price);
                    arrlist.add(2);
                    break;
                case 3:
                    ticket.price = ticket.price*3;
                    arrlist1.add(ticket.price);
                    arrlist.add(3);
                    break;
                case 4:
                    ticket.price = ticket.price*4;
                    arrlist1.add(ticket.price);
                    arrlist.add(4);
                    break;
                case 5:
                    ticket.price = ticket.price*5;
                    arrlist1.add(ticket.price);
                    arrlist.add(5);
                    break;
            }
        ticket.print();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("您要繼續購票嗎？(1:是,(2:否");
        int choice1 = Integer.parseInt(scanner1.next());
        switch (choice1){
            case 1:i=1;
            continue;

            case 2:i=0;
            break;
        }
           int sum = 0;
            for(i = 0;i < arrlist.size();i++) {

                sum+= (int) arrlist.get(i);
            }
            int sum1 = 0;
            for(i = 0;i < arrlist1.size();i++) {

                sum1+= (int) arrlist1.get(i);
            }
            System.out.println("您一共購買了"+sum+"張票,總共"+ sum1);

        } }
    }





