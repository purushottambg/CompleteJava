package threading;

import java.util.stream.IntStream;

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i: IntStream.range(0, 100).toArray()){
            System.out.println(Thread.currentThread().getName()+" is running!!");
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();

    }
}
