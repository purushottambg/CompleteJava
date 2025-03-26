package threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocking{

    private final Lock lock = new ReentrantLock();

    private void parentMethod(){
        lock.lock();
        try{
            System.out.println("Greeting from the Parent method");
            System.out.println("Current thread is:"+Thread.currentThread().getName() );
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Greeting from child Method");
            System.out.println("Current thread is:"+Thread.currentThread().getName() );
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
         ReentrantLocking reentrantLocking = new ReentrantLocking();
         reentrantLocking.parentMethod();
    }
}
