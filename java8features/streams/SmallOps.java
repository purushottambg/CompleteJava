package java8features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmallOps extends Thread{
    static Stream<Integer> smallOps;
    public static void main(String[] args)  throws Exception{
        SmallOps smallOpsT = new SmallOps();
        smallOpsT.setName("StreamThread");
        smallOpsT.start();
        System.out.println("Current Thread "+smallOpsT.getName()+" State is: "+ smallOpsT.getState());
        smallOpsT.run();
        smallOpsT.sleep(150);

        List<Integer> ValuesInStream = smallOps.skip(9) //this is eliminated
                .peek(x->System.out.print(" "+x+" "))  //peek used to pring or choose particular object and perform option
                //.max((a,b)->a-b)  returns the max of it same for min also
                .collect(Collectors.toList());
        //System.out.println(ValuesInStream);
    }

    @Override
    public void run() {
         smallOps = Stream.iterate(1, n->n*2).limit(15);
    }
}
