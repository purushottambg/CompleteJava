package threading;

/*
This program is written to understand the threads and their life cycle, print all the phases of thread.
Thread has life phases like, NEW, Runnable, Waiting, Blocked, Timed-Waiting, Terminated.
 */

public class ThreadLifeCycle extends Thread{

    @Override
    public void run(){
        System.out.println("After calling sleep method and overriding run() method state will be RUNNING, (but its not part of the life cycle)");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Exception occurred: "+e);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        ThreadLifeCycle t1 = new ThreadLifeCycle();
        System.out.println("After declaring the t1 Object State is: "+t1.getState());
        t1.start();
        System.out.println("After Calling the start() method state is: "+t1.getState());
        Thread.sleep(700);
        System.out.println("Sleep method is invoked, so State is: "+t1.getState());
        t1.join();
        System.out.println("Called join() method, ");

    }
}
