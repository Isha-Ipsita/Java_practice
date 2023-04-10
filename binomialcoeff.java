import java.util.*;


public class binomialcoeff {

public static int fact(int a){
int f=1;
for (int i = 1; i <=a; i++) {
    f=f*i;
}

    return f;
}

    public static void main(String[] args) {
        System.out.println("enter n and r values");
        Scanner pq=new Scanner(System.in);
        int n=pq.nextInt();
        int r=pq.nextInt();
        System.out.println("binomial coeff is-");
        int ans=fact(n)/fact(r)*fact(n-r);
        System.out.println(ans);

        pq.close();
    }
}
