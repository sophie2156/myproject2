package hello;

public class Costumor {
    String id;
    int amount;
    float off = 0.1f;
    public Costumor(String id,int amount){
        this.id=id;
        this.amount=amount;
    }
    /*public void print(){
        float gone = (amount/1000)*off*1000;
        float money = amount-gone;
        System.out.println(id+"\t"+amount+"\t"+money);
    }
    */

   public int giveBack(){
        return amount-money();
   }
   public int money(){
        return (int) (amount-(amount/1000)*off*1000);
   }
   public void print(){
        System.out.println(id+"\t"+amount+"\t"+money());
   }


}
