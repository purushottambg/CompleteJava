package basic;

public class BankDataType {
    int accountId;
    double balance;
    String name, address, nominee;
    public BankDataType(int accountId, String name, String address, double balance, String nominee){
        this.accountId=accountId;
        this.name=name;
        this.address=address;
        this.balance=balance;
        this.nominee=nominee;
    }

    void showDetails(){
        System.out.println("Holder Name: "+name);
        System.out.println("Account  ID: "+accountId);
        System.out.println("Users Address: "+address);
        System.out.println("Available balance: "+balance);
        System.out.println("Nomination: "+nominee);
    }
}
