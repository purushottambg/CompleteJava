/*

package threading.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class NotBook{

}

public class ReadWriteLocking extends Thread {
    private StringBuilder stringBuilder=new StringBuilder("This is the initial String");
    private final ReadWriteLock readWriteLocking = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLocking.readLock();
    private final Lock writeLock = readWriteLocking.writeLock();

    public void readString() throws Exception{
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is Reading! \t Value: " + stringBuilder);
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }
    public void writeString() throws Exception{
        writeLock.lock();
        try {
            stringBuilder=stringBuilder.append("Modified");
            Thread.sleep(50);
        }catch (InterruptedException e){
            System.out.println();
        }finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        Thread reader1 = new Thread("Reader1");
        Thread reader2 = new Thread("Reader2");
        Thread writer1 = new Thread("Writer1");

        reader1.start();
        writer1.start();
        reader2.start();

        try {
            reader1.join();
            writer1.join();
            reader2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
*/

package threading.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLocking {
    private StringBuilder stringBuilder = new StringBuilder("This is the initial String");
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();

    public void readString() {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is Reading! \t Value: " + stringBuilder);
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }

    public void writeString() {
        writeLock.lock();
        try {
            stringBuilder.append(" -> modified by ").append(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " is Writing!");
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteLocking locking = new ReadWriteLocking();

        // Create reader threads
        Thread reader1 = new Thread(() -> locking.readString(), "Reader1");
        Thread reader2 = new Thread(() -> locking.readString(), "Reader2");

        // Create writer thread
        Thread writer1 = new Thread(() -> locking.writeString(), "Writer1");

        // Start all
        reader1.start();
        writer1.start();
        reader2.start();

        try {
            reader1.join();
            writer1.join();
            reader2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
