package threading;

class Shoe{
    private static String resource = "Shoe";
    Shoe(String resource){
        this.resource=resource;
    }
    public String getResource(){
        return resource;
    }
}

class Specs{
    private static String resource = "Specs";
    Specs(String resource){
        this.resource=resource;
    }
    public String getResource(){
        return resource;
    }
}

public class DeadLock{
    public static void main(String[] args) {
        Specs specs = new Specs("Ray Bonn");
        Shoe shoe = new Shoe("Adidas");
        Thread rideThread = new Thread(()-> {
            action(shoe, specs, "ride");
        });

        Thread runThread = new Thread(()->{
            action(shoe, specs, "run");
        });

        rideThread.start();
        runThread.start();
        System.out.println("Let's see when they finish the job!");

    }

    public static synchronized void action(Shoe shoe, Specs specs, String activity){
        synchronized (shoe){
            synchronized (specs){
                if("run".equals(activity)){
                    System.out.println("For "+activity+" using "+shoe.getResource()+" and "+specs.getResource());
                } else {
                    System.out.println("For "+activity+" using "+shoe.getResource()+" and "+specs.getResource());
                }
            }
        }
    }

}
