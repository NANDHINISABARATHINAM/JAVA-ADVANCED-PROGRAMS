class MultiThrd2 implements Runnable{
    public  void run(){
        for(int i=0;i<5;i++){
            System.out.println("runnable interface");
        }
    }
}
public class MultiThrd extends Thread{
    public void run(){//override child method in Thread class
        for(int i=0;i<5;i++){
            System.out.println("run method");
        }
    }
    public static void main(String[] args) {
        MultiThrd ob=new MultiThrd();
        //ob.run();//no new thread created,no change of order
        ob.start();//create new thread and goes to runnable state
        //o/p cannot be predicted,thread scheduler decides what should be first executed
        for(int i=0;i<5;i++){
            System.out.println("main method");
        }
        MultiThrd2 obj=new MultiThrd2();
        //if obj,start() no,only run()
        //invoke run() in MultiThrd2 in Thread
        Thread t=new Thread(obj);
        t.start();
    }
}
