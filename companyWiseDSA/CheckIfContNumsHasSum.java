package companyWiseDSA;

public class CheckIfContNumsHasSum {
    public static void main(String[] args) {
        int[] intArray = {2, 1, 4, 20, 3, 5, 10, 5};
        System.out.println("Does array has nums that adds to 33 cont: "+sumMethod(intArray, 33));
    }

    public static boolean sumMethod(int[] arr, int num){

        int left=0,right=0, sum=0;
        while (left<arr.length){

            sum+=arr[right];

            while (sum>num && left<=right){
                sum-=arr[left];
                left++;
            }

            if(sum==num){
                return true;
            }

            right++;
        }

        return false;
    }
}
