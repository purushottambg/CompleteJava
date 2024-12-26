package threading;

class Sample extends Thread{
    public void run(){
        System.out.println("Sample Thread");
    }

}
public class ThreadMethods {
    public static void main(String[] args) throws Exception {
        Sample sample = new Sample();

        System.out.println("Thread Id: "+sample.getId());
        System.out.println("Current State of the Thread: "+sample.getState());
        sample.start(); //starting the thread so it'll be auto picket to run by the schedular.
        System.out.println("State of the Thread by running start method: "+sample.getState());
        sample.run(); //running the thread so it's status will be changed by schedular.
        System.out.println("State of the Thread by running start method: "+sample.getState());
        sample.sleep(1000);
        System.out.println("State of should be terminated: "+sample.getState());
        if (sample.isAlive())
            System.out.println("Thread is not alive");
        else
            System.out.println("Thread is alive");
    }
}
