import java.lang.Math;
public class primeornot {
        public static void main(String[] args) {
            int sumPrime=0;
            int sumComposite=0;
        int num=9;
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("number is not a prime");
                sumComposite +=num;
            }else{System.out.println("number is prime");  sumPrime +=num;}
            if(num==2){System.out.println("prime");}
            break;
        }
    }
}
