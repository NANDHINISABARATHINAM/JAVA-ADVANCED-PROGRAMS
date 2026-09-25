import java.util.*;
//only one abstract method
@FunctionalInterface
interface A
{
    void show(int i,int j);
}
/*class B implements A
{
    public void show(int i)
    {
        System.out.println("Functional Interface "+i);
    }
}*/
public class Main
{
    public static void main(String a[]){
        //A obj = new B();
        //obj.show(5);
        
        /*A ob=new A(){
            public void show(int i){
                System.out.println("Functional Interface through Anonymous inner class "+i);
            }
        };
        ob.show(5);*/
        
        /*A ob = i -> System.out.println("Functional Interface through Lambda Expression "+i);
        ob.show(5);*/
        A ob = (int i,int j) -> {
            System.out.println("Functional Interface through Lambda Expression "+i+" "+j);
        };
        ob.show(5,8);
        A obj = (int i,int j) -> System.out.println("Functional Interface through Lambda Expression "+i+j);
        obj.show(5,8);
    }
}
