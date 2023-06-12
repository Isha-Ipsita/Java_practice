public class InvertedRotatedPyramidHalf {


public static void PatternFunc(int tr, int tc){
for (int r = 1; r <= tr; r++) {
    //for (int c = 1; c <= tc; c++) {
        for (int i = 1; i <= tc-r; i++) {  // broke inner loop into 2 parts based on conditions 
            System.out.print(" ");
        }
        for (int j = 1; j <= r; j++) {
            System.out.print("*");
        }
   // }
    System.out.println();
}
}



    public static void main(String[] args) {
        PatternFunc(4, 40);
    }
}
