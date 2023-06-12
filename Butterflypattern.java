public class Butterflypattern {

public static void ButterflyPattern(int n){
  for (int row = 1; row <= n; row++) {
    //stars print
     for (int i = 1; i <= row; i++) {
        System.out.print("*");

     }
     //spaces print
     for (int s = 1; s <= 2*(n-row); s++) {
        System.out.print(" ");
     }
     //stars print
     for (int i = 1; i <= row; i++) {
        System.out.print("*");
     }
     System.out.println();
  }

// lower half code
for (int row = n; row >= 1; row--) {
     for (int i = 1; i <= row; i++) {
        System.out.print("*");

     }
     for (int s = 1; s <= 2*(n-row); s++) {
        System.out.print(" ");
     }
     for (int i = 1; i <= row; i++) {
        System.out.print("*");
     }
     System.out.println();
  }







}





    public static void main(String[] args) {
        ButterflyPattern(4);
    }
}
