class Shop{
    int bag=20;
    synchronized void order(int countOfOrder){
        if(bag>=countOfOrder){
            System.out.println("order successful");
            bag=bag-countOfOrder;
            System.out.println("remaining bags: "+bag);
        }
        else{
            try{
                System.out.println("waiting");
                wait();
            }catch(Exception e){}

            System.out.println("order successful after loading");
            bag=bag-countOfOrder;
            System.out.println("remaining bags after loading: "+bag);
        }
    }
    synchronized void load(int countOfLoad){
        bag=bag+countOfLoad;
        System.out.println("bags are loaded successfully");
        System.out.println("remaining bags: "+bag);
        notify();
    }
}
class Shopping extends Thread{
    Shop ob;
    Shopping(Shop ob){
        this.ob=ob;
    }
    public void run(){
        ob.order(50);
    }
}

public class IntrThrd extends  Thread{
    Shop ob;
    IntrThrd(Shop ob){
        this.ob=ob;
    }
    public void run(){
        ob.load(100);
    }

    public static void main(String[] args) {
        Shop ob=new Shop();
        Shopping obj=new Shopping(ob);
        IntrThrd obj1=new IntrThrd(ob);
        obj.start();
        obj1.start();
    }
}
