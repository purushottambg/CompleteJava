package threading;

public class PrioritiesInThreading extends Thread{
    public PrioritiesInThreading(String highPriorityThread, int priority) {
        super.setName(highPriorityThread);
        super.setPriority(priority);
    }

    @Override
    public void run() {
        try{
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println(e+ " Occurred");
        }
        System.out.println("Operations completed for:"+Thread.currentThread().getName()+" Current priority is:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        PrioritiesInThreading highThread = new PrioritiesInThreading("High_Priority_Thread", 10);
        PrioritiesInThreading medThread = new PrioritiesInThreading("Med_Priority_Thread", 5);
        PrioritiesInThreading lowThread = new PrioritiesInThreading("Low_Priority_Thread", 1);

        medThread.start();
        lowThread.start();
        highThread.start();

        System.out.printf("Current statuses are HIGH: %s, Med: %s, Low: %s Name: %s \n", highThread.getState(), medThread.getState(), lowThread.getState(), Thread.currentThread().getName());

    }
}
