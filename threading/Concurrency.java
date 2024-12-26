package threading;

public class Concurrency extends Thread{
    private static Integer globalVariable=0;
    public static void main(String[] args) {
        Concurrency concurrency = new Concurrency();
        concurrency.start();
        //concurrency.run();
        if(concurrency.isAlive()) {
            System.out.println("Waiting...");
            globalVariable = globalVariable + 3;
        }
        System.out.println("In main Global Variable: "+globalVariable);

    }
    public void run(){
        globalVariable++;
        System.out.println("Value of the Global Variable: "+globalVariable);
    }
}
