package oops;

public class InheritanceExample {
    public static void main(String[] args) {
        Alto alto = new Alto();
        System.out.println("Carur Capacity: "+alto.carryCapacity());
        alto.combuitonSound();
        System.out.println(alto.review());
    }
}

class Alto implements Vehicle{

    public void combuitonSound() {
        System.out.println("droom droom");
    }
    public int carryCapacity() {
        return topSpeed;
    }

    public long priceRange() {
        return 466357445;
    }

    public String Type() {
        return "SUV";
    }
    public String review(){
        return "Alto is small and under budget car";
    }
}

interface Vehicle{
    int topSpeed=0;
    double weight=0;

    public void combuitonSound();

    int carryCapacity();

    long priceRange();

    String Type();
}