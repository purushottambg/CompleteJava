package oops;

public class Encapsulation {                    //Creating to just show that encapsulation means
    public static void main(String[] args) {    //All the important data methods will be encapsulated in the one class
        ForEncapsulation forEncapsulation = new ForEncapsulation(23,76,"Purushottam Java Developer");
        ForEncapsulation forEncapsulation1 = forEncapsulation.giveObject(); //second object has all the values of the first object
        System.out.println(forEncapsulation1);
    }
}

class ForEncapsulation{
    private int enc1;               //this is the data being encapsulated
    private int enc2;               //Data is private and won't be accessed outside
    private String strVal;
    ForEncapsulation(int enc1, int enc2, String strVal){    //public methods that will help to manipulate the private data
        this.enc1=enc1;                                     //without letting outsiders know about it
        this.enc2=enc2;
        this.strVal=strVal;
    }
    public ForEncapsulation giveObject(){
        return this;
    }
    @Override
    public String toString(){
        return "Object Values: enc1: "+enc1+" enc2: "+enc2+ "strVal: "+strVal;
    }

}