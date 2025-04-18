package basic;
public class AutoBoxingUnboxingDemo {
    public static void main(String[] args) {

        // Autoboxing: converting int to Integer (primitive to object)
        int num = 100;
        Integer boxedNum = num; // Java automatically boxes it
        System.out.println("Autoboxed Integer: " + boxedNum);

        // Unboxing: converting Integer to int (object to primitive)
        Integer anotherBoxed = Integer.valueOf(200);
        int unboxedNum = anotherBoxed; // Java automatically unboxes it
        System.out.println("Unboxed int: " + unboxedNum);

        // Bonus: using autoboxing in Collections
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(10);  // int automatically boxed to Integer
        numbers.add(20);
        numbers.add(30);

        System.out.println("Stored in List (Autoboxed): " + numbers);

        // Unboxing while processing
        int sum = 0;
        for (Integer i : numbers) {
            sum += i; // unboxing here
        }

        System.out.println("Sum using unboxed ints: " + sum);
    }
}
