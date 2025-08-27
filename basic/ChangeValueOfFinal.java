package basic;

class Demo{
    public int value=0;
}
public class ChangeValueOfFinal {
    public static void main(String[] args) {
        final int age=0;
        int manipulatorVar = age;
        System.out.println("Final Var Value is:"+age);
        manipulatorVar++;

        System.out.println("Final Var Value after manipulation is:"+age);

        final Demo d1 = new Demo();
        System.out.println("Before Man:"+d1.value);
        Demo d2 = d1;
        d2.value=20;
        System.out.println("After Man:"+d1.value);
    }
}
