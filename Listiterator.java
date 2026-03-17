import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(30);
        l.add(40);
        System.out.println(l);
        ListIterator<Integer> l1=l.listIterator();
        //forward
        while(l1.hasNext()){
            System.out.println(l1.next());
        }
        //previous
        while(l1.hasNext()){
            l1.next();
        }
        while(l1.hasPrevious()){
            System.out.println(l1.previous());
        }
        //set and remove
        System.out.println("set and remove");
        while(l1.hasNext()){
            l1.next();
        }
        while(l1.hasPrevious()){
            Integer b=l1.previous();
            System.out.println(b);
            if(b==10){
                l1.set(100);
            }
            else if(b==30){
                l1.remove();
            }
            else if(b==40){
                l1.add(200);
            }
        }
        System.out.println(l);
    }
}
