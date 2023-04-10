import java.util.*;
public class scanfuncparam {

public static void scannsum(){
Scanner tm=new Scanner(System.in);
System.out.println("enter the digits ");
int a=tm.nextInt();
int b=tm.nextInt();
int c=a+b;
System.out.println("sum is :"+ c);
//function is void type so no return statement

}

public static int sumparam(int a , int b){
int c=a+b;
System.out.println("sum of a and b is: "+ c);
    return c;
} //int type func, need return statement.


//functions with parameters
public static int sumparam(int a , int b, int c){
    int d=a+b+c;
    System.out.println("sum of 3 numbers is: "+d);
    return d;
}


    public static void main(String[] args) {
        //scannsum();
Scanner hm=new Scanner(System.in);
System.out.println("enter 2 numbers");
int a=hm.nextInt();
int b=hm.nextInt();
hm.close();
int c=12;
// calling sumparam and giving arguments 
// sumparam(a,b);  CASE 1
sumparam(a,b,c);   //CASE 2
    }
} // sumparam can also be overloaded based on parameters and number of parameters used

// scene is going to be a tad bit different if values of a and b are scanned in main and transported back into the functions as parameters as seen in function 
//parameters are used when variables need to be transported from main function to the function where work is done 
// case 1 and 2 talks about method or function overload , where depending on the number of parameters java selects between 2 functions with same name 


