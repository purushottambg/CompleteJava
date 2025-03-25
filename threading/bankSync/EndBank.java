package threading.bankSync;

public class EndBank {

    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails("Purushottam", 12000.00);
        ThreadExtend t1 = new ThreadExtend(bankDetails);
        ThreadExtend t2 = new ThreadExtend(bankDetails);

        t1.run();
        t2.run();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("After all the Threading!!");
        bankDetails.getDetails();

    }
}
