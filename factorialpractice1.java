import java.util.*;

public class factorialpractice1 {

public static int fac(int a){
int f=1;

for(int i=1;i<=a;i++){
    f=f*i;
}


System.out.println(f);
    return f;
}






    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner hm=new Scanner(System.in);
        int a=hm.nextInt();
fac(a);
    }
}
