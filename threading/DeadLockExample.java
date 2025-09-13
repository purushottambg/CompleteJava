package threading;

class Friends{
    private String name;
    Friends(String name){
        this.name=name;
    }

    String greet(){
        return "Hello! this is "+name;
    }

    synchronized protected void eat(Friends friend){
        try{
            System.out.println(friend.name+" is eating and need spoon!");
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        synchronized (friend){      //DeadLock ProneCode
            friend.eat(friend);
        }
    }

}

public class DeadLockExample {
    public static void main(String[] args) {
        Friends Abhinav = new Friends("Abhinav");
        Friends Kunal = new Friends("Kunal");

        Thread t1 = new Thread(()->Abhinav.eat(Kunal));
        Thread t2 = new Thread(()->Kunal.eat(Abhinav));

        t1.start();
        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
    }
}
