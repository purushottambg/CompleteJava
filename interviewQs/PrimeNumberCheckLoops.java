package interviewQs;

public class PrimeNumberCheckLoops {
             public static void main(String[] args) {

            for(int i=1;i<=10;i++){
                checkPrime(i);
            }

        }

        public static void checkPrime(int number){
                 boolean flag=false;
            for(int i=2;i<number;i++){
                if(number%i==0 && i!=1){
                    flag=true;
                    break;
                }else{
                    flag=false;
                }
            }
            if (flag){
                System.out.println(number+" not Prime");
            }else {
                System.out.println(number+" is Prime");
            }
        }
    }
