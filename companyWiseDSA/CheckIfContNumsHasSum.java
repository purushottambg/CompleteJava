package companyWiseDSA;

public class CheckIfContNumsHasSum {
    public static void main(String[] args) {
        int[] intArray = {2, 1, 4, 20, 3, 5, 10, 5};
        System.out.println("Does array has nums that adds to 33 cont: "+sumMethod(intArray, 33));
    }

    public static boolean sumMethod(int[] arr, int num){

        for (int i = 0; i < arr.length; i++) {
            int k=i;
            int result=0;
            for (int j = 0; j <=i; j++) {
                 result+=arr[j];
            }
            System.out.println("Addition is:"+result);
            if(result==num){
                return true;
            }

        }


        return false;
    }
}
