package java8features.lambda;

interface AddTwoNum{
    Integer addTwoNums(Integer a, Integer b);
}

public class AddNums {
    public static void main(String[] args) {
        AddTwoNum addTwoNum = (a,b)->a+b;
        System.out.println(addTwoNum.addTwoNums(23,45));
    }
}