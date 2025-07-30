package java8features.lambda;

@FunctionalInterface
interface TrimString{
    String trimmedLen(String str);
}

public class TrimStringLength{
    public static void main(String[] args) {
        TrimString str = (String innerStr)->innerStr.trim();

        String trimmedString = str.trimmedLen(" stringdd ");

        System.out.println("After trimming:"+trimmedString);

    }
}
