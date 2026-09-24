import java.util.*;
enum Status{
	Running,Failed,Pending,Success;
}
//enus constructor
enum Laptop{
    Macbook(2000),XPS(2200),Surface,ThinkPad(1800);
    private int price;
    private Laptop(){
        price=5000;
        System.out.println("Default constructor "+this.name());
    }
    private Laptop(int price){
        this.price=price;
        System.out.println("Parameterized constructor "+this.name());
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
public class Main
{
	public static void main(String[] args) {
	    //access element
	    Status s=Status.Running;
	    System.out.println(s);
	    //access index
	    System.out.println(s.ordinal());
	    //access values
        Status [] ss = Status.values();
        System.out.println(ss[0]);
        //for loop
        for(Status i:Status.values()){
            System.out.println(i+" "+i.ordinal());
        }
        //if-else
        Status j = Status.Pending;
        if(j==Status.Running)
            System.out.println("All Good");
        else if(j==Status.Failed)
            System.out.println("Try Again");
        else if(j==Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
        //switch
        switch(s)
        {    
            case Running:
                System.out.println("All Good"); 
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");                
                break; 
        }
        Laptop l=Laptop.Macbook;
        System.out.println(l+" "+l.getPrice());
        for(Laptop i:Laptop.values()){
            System.out.println(i+" "+i.getPrice());
        }
	}
}
