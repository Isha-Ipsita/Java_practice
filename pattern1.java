
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        
        while(i<=num){
             
            int j=1;
              while(j<=num){
                System.out.print("*");
                j++;
              }
              System.out.println(" ");
                 i++;

        }


    }
}
