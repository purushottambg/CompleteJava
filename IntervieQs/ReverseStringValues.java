package IntervieQs;

public class ReverseStringValues {
    public static void main(String[] args) {
        String line = "the sky is blue";

        String[] stringArray = line.split(" ");
        String string="";

        for (int i = stringArray.length-1; i>=0; i--) {
            string+=stringArray[i]+" ";
        }

        System.out.print(string);

    }
}
