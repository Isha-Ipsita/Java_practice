
import java.lang.Math;
public class primeornot1 {
    public static void main(String[] args) {
        int num=9;
        for(int i=2; i<=num;i++){
            if(num%i==0){
                System.out.println("Number is composite");
            }else{System.out.println("number is prime");}
            break;
        }
    }
    
}
