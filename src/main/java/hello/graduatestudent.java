package hello;

public class graduatestudent extends scoring2{
    int thesis;
    public  graduatestudent (String name,int english,int math,int thesis){
        super(name,english,math);
        this.thesis=thesis;
    }
    public graduatestudent(String name){
        super(name);}

    @Override
    public void print(){System.out.println(name +"\t"+english+"\t"+math);}

}


