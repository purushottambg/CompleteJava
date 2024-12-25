package threading;

public class ThreadOne extends Thread{
    public static void main(String[] args) {
        ThreadOne ThreadInstance = new ThreadOne();
        ThreadInstance.start();
    }

    public void run(){
        System.out.println("This is using a Thread!");
    }
}