import java.util.*;
public class oddeven1 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("number is even ");
        }else{System.out.println("number is odd");}
        sc.close();
    }
}
