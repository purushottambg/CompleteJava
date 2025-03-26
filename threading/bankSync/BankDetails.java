package threading.bankSync;

import exceptions.InsufficientFundException;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankDetails {

    private double balance;
    private String name;
    private final Lock lock=new ReentrantLock();

    public BankDetails(String name, double balance){
        this.balance = balance;
        this.name = name;
    }
    public BankDetails(){};

    public void withdraw (double amount) throws InsufficientFundException {
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance<amount){
                    throw new InsufficientFundException();
                }
                System.out.println("Withdrawing "+amount+ " From the "+balance);
                balance-=amount;
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("Locked for a while");
        }finally {
            lock.unlock();
        }
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
