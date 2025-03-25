package threading;

public class SynchronizeOps extends Thread{
    private int counter=0;

    public void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
