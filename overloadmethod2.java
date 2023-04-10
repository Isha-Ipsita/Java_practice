//import java.util.*;
public class overloadmethod2 {
    // overloading using parameter data types 

public static int fun(int a,int b){
return a+b;
}

public static float fun(float a, float b){
    return a+b;
}


   public static void main(String[] args) {
    System.out.println(fun(1,2));
    System.out.println(fun(1.0f,2.0f));
   } 
}
