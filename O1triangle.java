public class O1triangle {

public static void Patternnn(int tr, int tc){
for (int row= 1; row <= tr; row++) {
    for (int col = 1; col <= row; col++) {
        if((row+col)%2==0){
            System.out.print("1");
        }else{System.out.print("0");}
    }
    System.out.println();
}

}
    public static void main(String[] args) {
        Patternnn(5,5);
    }
}
