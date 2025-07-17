package IntervieQs;

public class HSBCGuessOutputOfTheTryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
