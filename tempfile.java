import java.util.*;
public class tempfile {
    public static void main(String[] args) {
        int num=9;
        for (int i = 2; i <=Math.sqrt(num); i++) {     
            if (num%i==0) {
                System.out.println("not a prime");
            }
            else{
                System.out.println("abba jabba");
            }   
        }
    }
}