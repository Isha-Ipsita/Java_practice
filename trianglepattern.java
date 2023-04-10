/*
 

*
* *
* * *                        n=4 rows , columns= 1 less than row
* * * * 


 */



import java.util.*;
public class trianglepattern {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for (int i = 0; i < n; i++) {

        for (int j = 0; j < i+1; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    
}    
}

