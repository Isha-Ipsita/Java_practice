import java.util.*;
public class linear {
   public static int linear(int n[],int key) {
    for (int i = 0; i < n.length; i++) {
        if (n[i]==key) {
            return i;
        }
    }
    return -1;
   } 
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int key =5;
    int find=linear(arr, key);
    if (find==-1) {
        System.out.println("element is not present in the array");
    }
    else{
        System.out.println("element is at the index "+find);
    }
    
   }
   
}
