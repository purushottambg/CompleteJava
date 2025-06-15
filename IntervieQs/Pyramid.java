package IntervieQs;

public class Pyramid {
    public static void main(String[] args){
        printPyramid(7);
    }

    public static void printPyramid(int num){
        for(int i=1;i<=num;i++){
            for(int j=0;j<=num;j++){

                for(int k=j/2; k<j;k++){
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

}
