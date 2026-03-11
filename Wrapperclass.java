public class Wrapperclass {
    public static void main(String[] args) {
        int a=10;
        Integer a1=Integer.valueOf(a);//Boxing
        System.out.println(a);
        System.out.println(a1);

        Integer a2=a;//Autoboxing
        System.out.println(a2);

        System.out.println(a1.getClass());
        System.out.println(a2.getClass());

        char c='A';
        Character c1=Character.valueOf(c);
        System.out.println(c1);

        Boolean b=true;
        boolean b1=b.booleanValue();//Unboxing
        System.out.println(b1);

        boolean b2=b;//Autounboxing
        System.out.println(b2);
    }
}
