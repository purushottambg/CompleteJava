package exceptions;

public class NumericException {
    public static void main(String[] args) throws  Exception{
        int  a=10;
        Integer b =100;

        if (a==b){
            throw new Exception("Something went wrong");
        }else{
            b=a/0;
        }
    }
}
