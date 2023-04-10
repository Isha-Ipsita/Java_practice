import java.util.*;
public class swappcodefunction {



    public static void swapp(int a ,int b){

        
        
int temp=a;
a=b;
b=temp;
//case 1  printing in function
//System.out.println("value of a is-"+a);
//System.out.println("value of b is-"+b);

       
    }


    public static void main(String[] args) {
        Scanner df=new Scanner(System.in);
        int a=df.nextInt();
        int b=df.nextInt();
swapp(a,b);
//case 2 print in main function after calling swap function
System.out.println("value of a is-"+a);
System.out.println("value of b is-"+b);
//observe there is no swap occurring in case 2 

    }
}
/*
if we call a method passing a value - call by value
changes in called method makes no difference in calling method 
parameters in a method is a copy of the arguments passed during method call

 */