class Web{
    synchronized void show(String name) {
        for(int i=0;i<5;i++){
            System.out.println("welcome");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}

class User1 extends Thread{
    Web ob;
    String name;
    User1(Web ob,String name){
        this.ob=ob;
        this.name=name;
    }
    public void run(){
        ob.show(name);
    }
}

public class Synch {
    public static void main(String[] args) {
        Web ob=new Web();
        User1 obj=new User1(ob,"user1");
        User1 obj1=new User1(ob,"user2");
        User1 obj2=new User1(ob,"user3");

        obj.start();
        obj1.start();
        obj2.start();
    }
}
