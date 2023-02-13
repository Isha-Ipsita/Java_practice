import java.util.*;
public class arraypassbyreference {
    public static void func(int n[],int i){
        n[1]=10;
        i=10;

    }
    public static void main(String[] args) {
        int arr[] = new int[100];
        arr[1]=5;
        int n =5;
        func(arr, n);
        System.out.println(arr[1]+n);
       
    }
}
