
class One{
    synchronized void method1(Two ob){
        System.out.println("Method one started");
        ob.method4();
    }
    synchronized void method2(){
        System.out.println("Method two started");
    }
}
class Two{
    synchronized void method3(One obj){
        System.out.println("Method three started");
        obj.method2();
    }
    synchronized void method4(){
        System.out.println("Method four started");
    }
}
class ChildThrd extends Thread{
    One ob;
    Two obj;
    ChildThrd(One ob,Two obj){
        this.ob=ob;
        this.obj=obj;
    }
    public void run(){
        obj.method3(ob);
    }
}
public class Deadlock extends Thread{
    One ob;
    Two obj;
    Deadlock(One ob,Two obj){
        this.ob=ob;
        this.obj=obj;
    }
    public void run(){
        ob.method1(obj);
    }
    public static void main(String[] args) {
        One d=new One();
        Two d1=new Two();
        ChildThrd t=new ChildThrd(d,d1);
        Deadlock t1=new Deadlock(d,d1);

        t.start();
        t1.start();

    }
}
