package threading;

import java.util.stream.IntStream;

public class SyncTest extends Thread{
    public static void main(String[] args) {
        SynchronizeOps synchronizeOps = new SynchronizeOps();
        ExtendThread extendThread1 = new ExtendThread(synchronizeOps);
        ExtendThread extendThread2 = new ExtendThread(synchronizeOps);

        extendThread1.start();
        extendThread2.start();

        try {
            extendThread1.join();
            extendThread2.join();
        }catch (InterruptedException e){
            System.out.println("Exception "+e+" occurred!!");
        }

        System.out.println("Current value is: "+ synchronizeOps.getCounter());
    }
}
