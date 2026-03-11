class Web{
    static synchronized void show(String name) {
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

public class Staticsync {
    public static void main(String[] args) {
        Web ob=new Web();
        Web ob1=new Web();
        Web ob2=new Web();
        User1 obj=new User1(ob,"user1");
        User1 obj1=new User1(ob1,"user2");
        User1 obj2=new User1(ob2,"user3");

        obj.start();
        obj1.start();
        obj2.start();
    }
}
