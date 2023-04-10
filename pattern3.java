/*
 4 3 2 1 
 4 3 2 1
 4 3 2 1
 4 3 2 1
trick- n-j+1
 */





import java.util.*;
public class pattern3 {
   public static void main(String[] args) {
    System.out.println("enter a number for rows and columns");
    Scanner pat=new Scanner(System.in);
    int n=pat.nextInt();

for (int i = 1; i <= n; i++) {
    
    for (int j = 1; j <=n; j++) {
        System.out.print(n-j+1);
    }
    System.out.println(" ");
}





   } 
}
