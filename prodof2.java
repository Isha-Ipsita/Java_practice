
import java.util.*;

public class prodof2 {

public static int prod(int a,int b){
    int ans;
    ans=a*b;
    System.out.println("the produce is"+ans);
    return ans;
}

    public static void main(String[] args) {
        Scanner tm=new Scanner(System.in);
        System.out.println("enter 2 numbers-");
        int a=tm.nextInt();
        int b=tm.nextInt();
        prod(a,b);
    }
}
