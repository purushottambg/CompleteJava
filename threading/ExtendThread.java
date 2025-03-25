package threading;

import java.util.stream.IntStream;

public class ExtendThread extends Thread{
    private SynchronizeOps synchronizeOps;
    ExtendThread(SynchronizeOps synchronizeOps){
        this.synchronizeOps=synchronizeOps;
    }

    @Override
    public void run(){
        for (int c: IntStream.range(0,1000).toArray()){
            synchronizeOps.increment();
        }
    }

}
