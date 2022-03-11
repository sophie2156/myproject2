package hello;

public class scoring2 {
    String name;
    int english;
    int math;
    int average;
    public scoring2(String name){//Constructor
        this.name=name;
         }
    public scoring2(String name,int english,int math){//Constructor
        this.name=name;
        this.english=english;
        this.math=math;
    }
    public scoring2(){//Default constructor
         }
    public void print(){
    int average=(english+math)/2;
    System.out.print(name + "\t"+english+"\t"+math+"\t"+average);
    if (average<60){
        System.out.println("#");
    }

    }

}
