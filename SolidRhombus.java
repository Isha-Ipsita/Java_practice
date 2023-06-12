public class SolidRhombus {

public static void SolidRhombusPattern(int n ){
System.out.println("the pattern is ");
for (int i = 1; i <=n; i++) {
    for (int j = 1; j <= (n-i); j++) {
        System.out.print(" ");
    }
for (int j = 1; j <= n; j++) {
    System.out.print("*");
}
System.out.println();

}


}





    public static void main(String[] args) {
        SolidRhombusPattern(5);
    }
}
