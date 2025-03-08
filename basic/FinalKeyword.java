package basic;

final class One{
   static final int initialValue=0;

   public void greet(String name){
        System.out.println("Good to see you mr."+name);
   }

}
class Two{
    final int AgeLimit=0;
    int countInst=0;
    private int number;
    private String name;
    Two(){}
    Two(int n, String na){
        this.number=n;
        this.name=na;
        countInst++;
    }
    final void printData(){
        System.out.println("Current count is: "+countInst);
        System.out.println(toString()+" and ageLimit is: "+ AgeLimit);
    }
}
public class FinalKeyword extends Two{
    public static void main(String[] args) {
        One one = new One();
        one.greet("Purushottam");
        Two two = new Two(32, "Purushottam");
        if(two.AgeLimit<=0) System.out.println("Age limit is Zero");
    }
}
