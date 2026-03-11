class One1{
    void method(){
        System.out.println("ols version");
    }
}
abstract class Two2{
    abstract void demo();
}
public class Anonymousclass {
    public static void main(String[] args) {
        One1 ob=new One1(){ //class $one extends One1
            void method(){
                System.out.println("new version");
            }
        };
        ob.method();
        Two2 obj=new Two2(){ //class $two extends One1
            void demo(){
                System.out.println("abstract method");
            }
        };
        obj.demo();
        Thread t=new Thread(){
            public void run(){
                System.out.println("run method");
            }
        };
        t.start();
        Runnable r=new Runnable() { //class$three implements Runnable
            public void run() {
                System.out.println("runnable interface");
            }
        };
        Thread t1=new Thread(r);
        t1.start();
    }
}
