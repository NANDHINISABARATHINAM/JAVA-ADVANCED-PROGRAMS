import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //homogeneous
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(30);
        l.add(40);
        System.out.println(l);
        Iterator<Integer> i=l.iterator();
        while(i.hasNext()){
            Integer a=i.next();
            if(a==10){
                i.remove();
            }
        }
        Iterator<Integer> ii=l.iterator();
        while(ii.hasNext()){
            System.out.println(ii.next());
        }
        System.out.println(l);
        //next() method should be used only one time in loop

        //heterogeneous
        ArrayList l1=new ArrayList<>();
        l1.add("hi");
        l1.add('A');
        l1.add(100);
        Iterator<Object> i1=l1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        Iterator<Object> i2=l1.iterator();
        while(i2.hasNext()){
            Object a=i2.next();
            //typecast
            if(a instanceof Integer){
                Integer b=(Integer)a;
            }
            else if(a instanceof String){
                String s=(String)a;
            }
            else if(a instanceof Character){
                Character c=(Character)a;
            }
            if(a.equals(10)){
                i2.remove();
            }
        }

    }
}
