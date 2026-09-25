import java.util.*;
//only one abstract method
@FunctionalInterface
interface A
{
    int add(int a,int b);
}
public class Main
{
    public static void main(String a[]){
        /*A ob=new A(){
          public int add(int i,int j){
              return i+j;
          }  
        };
        int result=ob.add(5,8);
        System.out.println(result);*/
        
        /*A ob=(int i,int j)->{
            return i+j;
        };
        int result=ob.add(5,8);
        System.out.println(result);*/
        
        A ob=(i,j)-> i+j;

        int result=ob.add(5,8);
        System.out.println(result);
    }
}
