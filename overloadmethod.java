//import java.util.*;
/*
methods->  
user defined
inbuilt method - math(pow,sqrt,max)
               - sc.nextInt()

FUNCTION OVERLOADING
multiple functions with the same name but with different parameters, in same class
ex- calculator multiply(int a,int b)
               multiply(int a, int b,int c)
               multiply(float a,float b)
               difference-
               type of parameters
               number of parameters


  f1: sum of 2 no.  int sum(int a,int b)
                       return a+b;
                       f2- sum of three numbers
 */                    
// overloading as number of parameters 
public class methods {

public static int sum(int a, int b){
    return a+b;
    
}
public static int sum(int a,int b,int c){
    return a+b+c;
    
}



    public static void main(String[] args) {
        //call appropriately 
System.out.println(sum(1,2));
System.out.println(sum(1,2,3));
    }
}
/*
func overloading dosen't depend on return type- 
int sum(int a,int b)
float sum(int a,int b)      not overload

ONLY DIFFERENCE IN PARAMETERS

 */