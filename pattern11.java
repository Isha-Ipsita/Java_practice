/*
 
A A A
B B B
C C C


 */







import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
System.out.println("enter a number");
int n =sc.nextInt();
char ch ='a';



for (int i = 1; i <= n; i++) {




    for (int j = 1; j <= i; j++) {
        
        int chh=ch+i-1;
        System.out.print((char)chh);
    }
    

    System.out.println();
}


    }
}
