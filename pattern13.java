/* 
1000000001
2200000022
3330000333
4444004444

 */


import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <=i; k++) {
                System.out.print(i);
            }
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("0");
            }
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("0");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
