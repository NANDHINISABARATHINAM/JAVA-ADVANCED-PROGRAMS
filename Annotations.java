import java.util.*;
@Deprecated
class A{
    public void abcdefgdgjegerdjmgeskf(){
        System.out.println("A");
    }
}
class B extends A{
    @Override
    public void abcdefgdgjegerdjmgeskf(){
        System.out.println("B");
    }
}
public class Main
{
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
	    B ob=new B();
	    ob.abcdefgdgjegerdjmgeskf();
	    //ArrayList<String> cars = new ArrayList<>();
	    ArrayList cars = new ArrayList();
        cars.add("Volvo");
        System.out.println(cars);
	}
}
