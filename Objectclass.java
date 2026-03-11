public class Objectclass implements Cloneable{
    int b;

    public String toString(){
        return "Object class";
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Objectclass ob=new Objectclass();
        //getClass()
        System.out.println(ob.getClass());

        Integer a=20;
        System.out.println(a.getClass());

        String s="hi";
        System.out.println(s.getClass());

        //hashCode()
        System.out.println(ob.hashCode());
        System.out.println(a.hashCode());
        System.out.println(s.hashCode());

        //clone()
        ob.b=20;
        System.out.println(ob.b);
        Objectclass obj=(Objectclass)ob.clone();
        System.out.println(obj.b);
        obj.b=200;
        System.out.println(ob.b);
        System.out.println(obj.b);

        //toString
        System.out.println(ob);
        System.out.println(obj);
    }
}
