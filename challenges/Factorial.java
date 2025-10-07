package challenges;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial");
        System.out.println(factorial(3));
        System.out.println("Fibonacci");
        for (int i=1; i<=10; i++)
            System.out.print(fibonacci(i)+", ");

        System.out.println("\nSwap Numbers");
        System.out.print("Before Swap: 12, 23 & after Swap:");
        swap(12, 23);
    }

    public static void swap(int i, int j){  //10 12
        i=i+j;  //22
        j=i-j;
        i=i-j;

        System.out.println("I:"+i+" J:"+j);
    }

    public static int factorial(int num){
        if (num==0 || num==1)
            return 1;
        else return factorial(num-1)*num;
    }

    public static int fibonacci(int num){
         if(num==0) return 0;
         else if(num==1) return 1;
         else return fibonacci(num-1)+fibonacci(num-2);
    }

}
