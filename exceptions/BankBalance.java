package exceptions;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Bank{
    private double balance;
    boolean lockStatus = false;
    ReentrantLock lock = new ReentrantLock();
    Bank(double balance){this.balance=balance;}

    public void withdraw(double amount){
        try{
            lockStatus = lock.tryLock(7000, TimeUnit.MILLISECONDS);
            if(!lockStatus) {
                System.out.println("Failed to acquire the lock on withdraw method");
                return;
            }
            if (amount>balance) System.out.println("Insufficient Balance!!");
            else {
                balance-=amount;
                System.out.println(amount+" Has been deducted, available balance is:"+balance);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }finally {
            if (lockStatus) lock.unlock();
        }
    }
}
public class BankBalance {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank(12000.00);

        Thread thread1 = new Thread(() -> bank.withdraw(10000));
        Thread thread2 = new Thread(() -> bank.withdraw(500));
        Thread thread3 = new Thread(() -> bank.withdraw(7000));
        Thread thread4 = new Thread(() -> bank.withdraw(300));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Process completed");

    }
}


