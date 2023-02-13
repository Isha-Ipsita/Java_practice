import java.util.*;
public class typeconversion {
 public static void main(String[] args) {
   // conversion occurs in compatible data types ex- int into float not boolean source is smaller than dest
//rules for type conversion:
//types must be compatible 
//destination type> source type   or else lossy conversion occurs which needs to be done manually by type casting 
//byte->short->int->float->long->double->
//java normally does widening conversion also known as implicit conversion 
Scanner sc =new Scanner(System.in);
float number =sc.nextInt();
System.out.println(number); // here scanning is done in int which is then converted into float , as number is of float data type float>int so happens seamlessly 



 }   
}
