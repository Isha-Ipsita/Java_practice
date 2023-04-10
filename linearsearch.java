import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        Scanner sc =new Scanner(System.in);
        int key=sc.nextInt();
        int ans =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                ans=i;
             }
            
        }
        if (ans ==-1) {
            System.out.println("element is not present in the array");
            
        }else{System.out.println("elemenyty is present at position"+ans);}

    }
}
