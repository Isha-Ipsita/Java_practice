import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

                for (int j2 = 1; j2 > i; j2--) {
                    System.out.print(i);
                }
            }


            System.out.println(" ");
        }
    }
}
