public class Diamond {

public static void Dia(int n ){
    // for half diamond 
for (int i = 1; i <=n; i++) {
    // print spaces 
    for (int j = 1; j <= (n-i); j++) {
        System.out.print(" ");
    }
    // print stars
  for (int k = 1; k <= ((2*i)-1); k++) {
    System.out.print("*");
  }

System.out.println();


}

// for full diamond
for (int i = n; i >=1; i--) {
    // print spaces 
    for (int j = 1; j <= (n-i); j++) {
        System.out.print(" ");
    }
    // print stars
  for (int k = 1; k <= ((2*i)-1); k++) {
    System.out.print("*");
  }

System.out.println();


}






}




    public static void main(String[] args) {
        Dia(4);
    }
}
