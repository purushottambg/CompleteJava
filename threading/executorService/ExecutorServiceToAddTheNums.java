package threading.executorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceToAddTheNums {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> result;
        result = executorService.submit(()->  4*3);
        System.out.println("Final Result:"+result);
        System.out.println(result.get());
        executorService.shutdown();
        System.out.println(executorService.isTerminated());
    }
}
