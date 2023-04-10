/*
   1 2 3
   4 5 6
   7 8 9
 */




import java.util.*;
public class pattern4 {
   public static void main(String[] args) {
    System.out.println("enter a number for rows and columns");
    Scanner pat=new Scanner(System.in);
    int n=pat.nextInt();

for (int i = 1; i <= n; i++) {
    
    for (int j = 1; j <=n; j++) {
       for (int j2 = 0; j2 < n*n; j2++) {
        System.out.print(j2);
       }
    }
    System.out.println(" ");
}





   }
   
}
