package threading;

public class LambdaThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello");
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
