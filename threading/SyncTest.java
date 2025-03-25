package threading;

import java.util.stream.IntStream;

public class SyncTest extends Thread{
    public static void main(String[] args) {
        SynchronizeOps synchronizeOps = new SynchronizeOps();
        SyncTest syncTest = new SyncTest();
        synchronizeOps.increment();
        for (int i: IntStream.range(1,1000).toArray()){
            synchronizeOps.increment();
        }
        System.out.println("Current Value of counter is: "+synchronizeOps.getCounter());
    }
}
