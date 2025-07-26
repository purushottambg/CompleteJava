package companyWiseDSA;

public class FinallyBlockCheck {
    public static void main(String[] args) {
        System.out.println("Result is from:"+demo());
    }
    public static int demo() {
        try {
            System.out.println("Try");
            return 10;
        } finally {
            System.out.println("Finally");
            return 20;
        }
    }
}
