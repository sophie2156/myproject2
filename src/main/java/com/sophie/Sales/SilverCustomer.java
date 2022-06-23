package com.sophie.Sales;

public class SilverCustomer extends Costumor {
   public SilverCustomer(String id,int amount){
       super(id,amount);
   }
   @Override
    public void print(){
       System.out.println(id+"\t"+amount+"\t"+money()+"\t"+giveBack()+"give back");
   }

}
