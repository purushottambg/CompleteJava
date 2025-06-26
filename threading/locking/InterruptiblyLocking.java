package threading.locking;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InterruptiblyLocking {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Thread abhang = new Thread(() ->{
            try {
                lock.lockInterruptibly();
                System.out.println("Playing the Abhang on radio...");
                Thread.sleep(5000);
                System.out.println("Continuing the Abhang!!");
            }catch (Exception e){
                System.out.println("Exception "+e);
            }finally {
                lock.unlock();
            }
        });

        Thread alarm = new Thread(()->{
            try{
                Thread.sleep(50);
                abhang.interrupt();
                System.out.println("Alarm for Market Start");
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        );

        abhang.start();
        alarm.start();

    }
}
