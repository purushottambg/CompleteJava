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

        Runnable readThread = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Reader");
                for (int i = 0; i < 10; i++) {
                    locking.readString();
                }
            }
        };

        Runnable writeThread = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Writer");
                for (int i = 0; i < 10; i++) {
                    locking.writeString();
                }
            }
        };

        // Create reader threads
        Thread reader1 = new Thread(readThread);
        Thread reader2 = new Thread(readThread);
         // Create writer thread
        Thread writer1 = new Thread(writeThread, "Writer-1");

        // Start all
        reader2.run();
        writer1.run();
        reader2.run();

        try {
            reader2.join();
            writer1.join();
            reader2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
