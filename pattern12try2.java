import java.util.*;
public class pattern12try2 {
    public static void main(String[] args) {
        System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for (int i = 1; i <=n ; i++) {
    for (int j = 1; j <=i; j++) {
        System.out.print(i);
    }
    for (int j = 1; j <= n-i+1; j++) {
        System.out.print("0");
    }
    for (int j = 1; j <=n-i+1; j++) {
        System.out.print("0");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print(i);
    }
    System.out.println(" ");
}








    }
}
