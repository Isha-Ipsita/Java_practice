import java.util.*;
public class Hollowrectangle{

public static void HollowrectFunc(int tr, int tc){ // total rows or total columns 
for (int row = 1; row <= tr; row++) {
    for (int col = 1; col <= tc; col++) {
        //cell-(i,j) find boundary cells and print *or else blank
        if(row==1|row==tr|col==1|col==tc){
            System.out.print("*");
        }else{System.out.print(" ");}
    }
    System.out.println();
}
}
    public static void main(String[] args) {
        System.out.println("enter diamentions for this pattern:");
      // calling func
      HollowrectFunc(4, 5);

    }
}

// think of a matrix from now on - 2d array data structure 