import java.util.*;
public class pattern13prac {
    public static void main(String[] args) {
        
System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=1;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(count);
        
    }
    for (int j = 1; j <=n; j++) {

       
        for (int j2 = 0; j2 < args.length; j2++) {
            System.out.print("0");
        }
        System.out.println(" ");
    }
    System.out.println( " ");
    count++;
}









    }
}
