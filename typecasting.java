import java.util.*;
public class typecasting {

   /*lossy conversions are done manually and termed as type casting  
   SYNTAX-  
   float a=25.0;
   int b=a;
   int b=(int)a;
           |_ mention inside this parenthesis the data type u want to manually convert into (destination data type)

   */ 
   
// float a=25.12; // throws error -lossy conversion aka type mismatch from double to float
 //float a=25.12f ;
//int b=a; // mismatch here can't convert float to int

//here comes type casting

public static void main(String[] args) {
    float a=12.25f;
int b=(int) a ;
System.out.println(b);

}

}
