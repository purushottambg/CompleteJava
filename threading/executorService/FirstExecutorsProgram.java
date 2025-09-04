package threading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirstExecutorsProgram {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 45; i++) {
            int finalI=i;
            executorService.submit(()->{
                System.out.println("Current Thread: "+Thread.currentThread().getName());
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    System.out.println("Exception: "+e);
                }
            });
        }
        executorService.shutdown();
    }
}
