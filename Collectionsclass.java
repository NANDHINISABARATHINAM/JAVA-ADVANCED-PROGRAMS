import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> l=Arrays.asList("Banana","Apple","Mango","Cherry","Apple");
        System.out.println(l);
        //sort
        Collections.sort(l);
        System.out.println("after sorting:"+l);
        //reverse
        Collections.reverse(l);
        System.out.println("Reverse:"+l);
        //shuffle
        Collections.shuffle(l);
        System.out.println("shuffle:"+l);
        //swap
        Collections.swap(l,0,1);
        System.out.println("swap:"+l);
        //min
        System.out.println("min:"+Collections.min(l));
        //max
        System.out.println("max:"+Collections.max(l));
        //frequency
        System.out.println("frequency:"+Collections.frequency(l,"Apple"));
        //replace all
        Collections.replaceAll(l,"Apple","Orange");
        System.out.println("replace all:"+l);
        //fill all 
        Collections.fill(l,"Fruit");
        System.out.println("fill:"+l);
    }
}
