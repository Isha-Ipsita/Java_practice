
/*
see the representation-
 n! = n* (n-1)!
 */

import java.util.*;
public class factorial {
    public static int fact(int a){
       int f=1; //initialize
for(int i=1;i<=a;i++){
     f=f*i;
}
System.out.println("factorial of entered digit is:"+ f);
        return f;
    }
    public static void main(String[] args) {
        System.out.println("enter a number-");
        Scanner dm=new Scanner(System.in);
       int a=dm.nextInt();
        fact(a);
    }
}
