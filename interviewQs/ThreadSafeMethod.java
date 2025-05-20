package interviewQs;

class Counter{
    private int counterVar=0;

    public synchronized void increaseVar(){
        counterVar++;
    }

    public int getCounterVar(){
        return counterVar;
    }

}

public class ThreadSafeMethod {
    public static void main(String[] args) throws Exception{

        Counter counter = new Counter();

        Runnable threadOne = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increaseVar();
            }
        };

        Thread t1 = new Thread(threadOne);
        Thread t2 = new Thread(threadOne);

        t1.start();
        t2.start();

        System.out.println("Current value of counter: "+counter.getCounterVar());
        t1.join();
        t2.join();

        System.out.println("final output of counter: "+counter.getCounterVar());
    }
}