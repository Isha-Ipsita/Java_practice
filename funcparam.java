import java.util.*;


/*
 SYNTAX 
 returnType name(type param1,type param2){
    //body
return statement;
 }

 parameters act as an input for the method to act on 




 */




//in function sum having parametrs a and b trying to return sum 


public class funcparam {
public static int sumof(int a,int b){
    int c=a+b;
    System.out.println(c);
    return c;
}



    public static void main(String[] args) {
        
//calling the function sumof
sumof(3,4);

    }
}
