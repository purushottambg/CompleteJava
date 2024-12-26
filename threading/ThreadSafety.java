package threading;

class CounterClass{
    int countVal=0;
    public synchronized void increaseCount(){   //synchronized is the thread safety methods
        countVal++;
    }
    public int showCount(){
        return countVal;
    }
}

public class ThreadSafety {
    public static void main(String[] args) throws Exception{
        CounterClass counterClass = new CounterClass();
        Runnable thread1 = ()->{
            for (int i=0;i<1000;i++){
                counterClass.increaseCount();
            }
        };
        Runnable thread2 = ()->{
            for (int i=0;i<1000;i++){
                counterClass.increaseCount();
            }
        };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
        t1.join();      //Threads will wait for each other to finish their jobs
        t2.join();      //Threads will wait for each other to finish their jobs
        System.out.println("Current value of the counter: "+counterClass.showCount());
    }
}
