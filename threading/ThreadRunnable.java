package threading;

public class ThreadRunnable implements Runnable{
    public static void main(String[] args) {
        ThreadRunnable threadRunnable = new ThreadRunnable();
        //threadRunnable.run();
    }

    @Override
    public void run() {
        System.out.println("this thread has been created by implementing runnable interface.");
    }
}
