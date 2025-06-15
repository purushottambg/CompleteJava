package interviewQs;

public class PrimeNumberCheckLoops {
             public static void main(String[] args) {

            for(int i=1;i<=10;i++){
                checkPrime(i);
            }

        }

        public static void checkPrime(int number){
            for(int i=1;i<number;i++){
                if(number%i==0 && i!=1){
                    System.out.println(number+ " Prime");
                }else{
                    System.out.println(number+ " Not Prime");
                }

            }

        }
    }
