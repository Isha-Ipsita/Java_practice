import java.util.*;
public class scanfuncparam2 {

   /*  public static int sumparamm(int num1 , int num2){
        int sum=num1+num2;
        System.out.println("the sum is- "+sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter 2 digits ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sumparamm(a,b);
    }

                  OR
    */

    public static int summ(int num1,int num2){ //parameters or formal parameters 
        int sum=num1+num2 ;
        return sum ;
    }
public static void main(String[] args) {
    System.out.println("enter 2 digits ");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    sc.close();
    int sum=summ(a,b);  // a and b are arguments or actual parametrs // printing part is beign executed in main here 
    System.out.println("sum is- "+ sum);
    //notice the sum variable in main and in summ function both are different and have been declared separately 
    // Scopes topic 
}
  /*
   parameters are of two types-
   1. formal parameters , parameters - comes in function definition
 2. actual parameters or arguments - comes in function calls

   */ 





}


