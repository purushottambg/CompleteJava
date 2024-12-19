package oops;

public class test {
    public static void main(String[] args) {
        ObjectToBeCreated objectToBeCreated = new ObjectToBeCreated(22);

    }
}

class ObjectToBeCreated{
    private  int one;
    ObjectToBeCreated(int varVal){
        this.one=varVal;
    }
}
