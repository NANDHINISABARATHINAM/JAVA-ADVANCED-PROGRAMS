public class DaemonThrd extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("lighting");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DaemonThrd ob=new DaemonThrd();
        ob.setDaemon(true);
        ob.start();
        System.out.println(ob.isDaemon());
        for(int i=0;i<10;i++){
            System.out.println("dancing");
                Thread.sleep(1000);
        }
    }
}
