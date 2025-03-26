package threading.bankSync;

public class ThreadExtend extends Thread{
    BankDetails bankDetails;
    public ThreadExtend(BankDetails ba){
        this.bankDetails=ba;
    }

    @Override
    public void run(){
        try {
            bankDetails.withdraw(12000.00);
            bankDetails.addFund(1000.00);
            bankDetails.withdraw(15000.00);
        }catch (Exception e){
            System.out.println("Exception "+e+" occurred!");
        }
    }

}
