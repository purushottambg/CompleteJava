package threading;

import java.util.stream.IntStream;

public class ParallelRunning {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();
        one.start();
        two.start();
    }
}

class One extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Greet from one!!");
        }
    }
}

class Two extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Greet from two!!");
        }
    }
}