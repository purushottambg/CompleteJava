package connectwise;

import java.util.List;

class PrintEvenThread extends  Thread{
    @Override
    public void run(){
        System.out.println("Even");
    }
}

class PrintOddThread extends  Thread{
    @Override
    public void run(){
        System.out.println("Odd");
    }
}

public class ThreadForEven {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            if (i%2==0){
                PrintEvenThread t1 = new PrintEvenThread();
                t1.run();
            }else {
                PrintOddThread t2 = new PrintOddThread();
                t2.run();
            }
        }
    }
}
