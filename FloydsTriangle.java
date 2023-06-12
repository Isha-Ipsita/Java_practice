public class FloydsTriangle {

public static void Patternn(int tr, int tc){
    int count=1;
for (int r = 1; r<=tr; r++) {
   for (int i = 1; i <= r; i++) {
    System.out.print(count+" ");
      count++;
   }
      
   
    System.out.println();
}
}




    public static void main(String[] args) {
        Patternn(5, 5);
    }
}
