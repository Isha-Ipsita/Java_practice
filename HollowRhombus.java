

public class HollowRhombus {

public static void RhombusHollow(int n){
    for (int i = 1; i <= n; i++) {
        // first print spaces 
        for (int j = 1; j <= (n-i); j++) {
            System.out.print(" ");
        
       }
// now code for hollow rectangle 
      for (int j = 1; j <= n; j++) {
        if(i==1|i==n|j==1|j==n){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
      }
System.out.println();

    }
}



    public static void main(String[] args) {
        RhombusHollow( 5);
    }
}
