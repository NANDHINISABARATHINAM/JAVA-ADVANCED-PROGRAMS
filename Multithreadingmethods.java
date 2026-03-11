public class ThrdMeths extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+ Thread.currentThread().getName());

            //yield will stop t1 which is taking more time to execute and resume other thread, share priority
            //Thread.yield();

            //sleep method always use exception
           try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThrdMeths ob=new ThrdMeths();
        //currently thread state
        System.out.println(ob.getState());

        ob.start();
        ThrdMeths ob1=new ThrdMeths();
        ob1.start();
        //wait for single thread execution,don't interrupt
        //ob.join();
        //ob1.join();

        System.out.println(ob.getState());
        System.out.println(ob1.getState());

        //thread is executed or terminated
        System.out.println(ob.isAlive());
        System.out.println(ob1.isAlive());
    }
}

/*
Here is the **plain text version with printing thread state** (simple and exam-friendly):

start() – Starts a new thread and begins concurrent execution.
Example: t.start();

run() – Contains the code that the thread executes.
Example: public void run(){ }

sleep(long time) – Pauses the current thread for a specified time.
Example: Thread.sleep(1000);

join() – Makes one thread wait until another thread finishes execution.
Example: t.join();

yield() – Pauses the current thread to allow other threads to execute.
Example: Thread.yield();

getPriority() – Returns the priority of the thread.
Example: System.out.println(t.getPriority());

setPriority(int p) – Sets the priority of the thread (1–10).
Example: t.setPriority(5);

currentThread() – Returns the currently executing thread.
Example: Thread t = Thread.currentThread();

getName() – Returns the name of the thread.
Example: System.out.println(t.getName());

setName(String name) – Assigns a name to the thread.
Example: t.setName("Thread-1");

isAlive() – Checks whether the thread is running.
Example: System.out.println(t.isAlive());

activeCount() – Returns the number of active threads.
Example: System.out.println(Thread.activeCount());

getState() – Returns the current state of the thread.
Example: System.out.println(t.getState());

interrupt() – Interrupts a sleeping or waiting thread.
Example: t.interrupt();

isInterrupted() – Checks whether a thread has been interrupted.
Example: System.out.println(t.isInterrupted());

stop() – Stops thread execution immediately (deprecated).
Example: t.stop();

suspend() – Suspends thread execution (deprecated).
Example: t.suspend();

resume() – Resumes a suspended thread (deprecated).
Example: t.resume();

 */
