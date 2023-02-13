import java.util.*;
public class primecompo {
    public static void main(String[] args) {
        int num=9;
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0) {
                System.out.println("is not prime");
                break;
              } 
           
        }
        System.out.println("is prime");
    }
    
}
