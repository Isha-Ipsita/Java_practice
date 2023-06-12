public class InvertedRotatedHalfPyramidNumbers {

public static void Pattern(int tr,int tc){
    for (int r = 0; r <tr; r++) {
        for (int i = 1; i <= tr-r; i++) {
            
                System.out.print(i);
            
        }
        for (int j = 1; j <= r; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}




    public static void main(String[] args) {
        Pattern(5, 5);
    }
}
