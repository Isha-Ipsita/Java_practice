import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("enter age-");
   Scanner sc= new Scanner(System.in);
   int age=sc.nextInt();
    if (age>=18) {
   System.out.println("u can drive");
  } else {
    System.out.println("u can't drive");
  }
  }
}
