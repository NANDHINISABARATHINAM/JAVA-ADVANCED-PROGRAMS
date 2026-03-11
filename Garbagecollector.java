public class Garbagecollector {
    void demo(){
        Garbagecollector ob=new Garbagecollector();
    }
    public void finalize(){//protected also
        System.out.println("garbage collector called");
    }
    public static void main(String[] args) {
        Garbagecollector ob=new Garbagecollector();
        //ob=null;
        Garbagecollector obj=new Garbagecollector();
        //ob=obj;
        //new Garbagecollector();

        System.out.println("hello");
        ob.demo();
        System.gc();//call garbage collector and call finalize internally
    }
}
