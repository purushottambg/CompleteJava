package threading;

class SharedResource{
    private String message;
    private Boolean flag=false;

    public synchronized void produceData(){
        while(flag){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        message+=" Version";
        flag=true;
        System.out.println("Produced..");
        notify();
    }

    public synchronized String consumeData(){
        while (!flag){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        flag = false;
        System.out.println("Consumed: " + message);
        notify();
        return message;
    }

}

class Producer implements Runnable {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produceData();
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String value = resource.consumeData();
        }
    }
}

public class CommunicationInThreading {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(new Producer(resource));
        Thread t2 = new Thread(new Consumer(resource));

        t1.start();
        t2.start();
    }
}
