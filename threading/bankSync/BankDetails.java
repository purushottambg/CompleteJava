package threading.bankSync;

import exceptions.InsufficientFundException;

public class BankDetails {

    private double balance;
    private String name;

    public BankDetails(String name, double balance){
        this.balance = balance;
        this.name = name;
    }
    public BankDetails(){};

    public void withdraw (double amount) throws InsufficientFundException {
        if(balance<amount){
            throw new InsufficientFundException();
        }

        balance-=amount;
    }

    public void getDetails(){
        System.out.println("Hi, "+name+" Current balance is "+balance);
    }

    public double checkBalance(){
        return balance;
    }

    public double addFund(double amout){
        balance+=amout;
        return balance;
    }

}
