/*
 1
 2 1
 3 2 1
 4 3 2 1

 */

import java.util.*;
public class patternn {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("please enter a number");
int n=sc.nextInt();

        for (int i = 0; i < n; i++) {
            

    for (int j = 0; j < i+1; j++) {
        System.out.print(i-j+1);
    }


     System.out.println(" ");

        }




    }
}
