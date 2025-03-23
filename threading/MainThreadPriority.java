package threading;

public class MainThreadPriority extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(300);
        }catch (Exception e){
            System.out.println("Exception is"+ e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MainThreadPriority t1 = new MainThreadPriority();
        t1.start();
        System.out.println("Priority of the main thread is: "+t1.getPriority());
        t1.setPriority(1);
        Thread.sleep(100);
        System.out.println("current stat is: "+t1.getState());
        t1.join();
        System.out.println("Priority of the main thread is: "+t1.getPriority());
    }
}
