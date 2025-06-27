package threading;

public class MultiThreadedFactorialCalculations {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[25];
        for (int i = 0; i < 25; i++) {
            int finalI = i;
            threads[i] = new Thread(()->{
                System.out.println(factorial(finalI));
            });
            threads[i].start();
        }

        for (Thread thread: threads){
            try {
                thread.join();
            }catch (InterruptedException e){
                System.out.println("Exception "+e);
            }
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("Total Time required:"+(System.currentTimeMillis()-startTime));
    }
    public static Long factorial(int num){
        Long result=Long.valueOf(0);

        if(num==1 || num==0){
            result=1l;
        }else if(num==2){
            result=2l;
        }else{
            result=num*factorial(num-1);
        }

        return result;
    }
}
