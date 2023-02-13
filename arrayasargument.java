import java.util.*;
public class arrayasargument {
    public static void update(int marks[],int nonChangeable[],int nonChangeabl) {
        nonChangeable[1] =5;
        nonChangeabl =5;
        for (int i = 0; i < marks.length; i++) {
            marks[i]+=1;        }
    }
    public static void main(String[] args) {
        int marks[] ={96,97,98};
        int nonChangable[]=new int[2];
        nonChangable[1]=10;
        int yu=10;
        update(marks,nonChangable,yu);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("the marks of "+i+" are "+marks[i]);
           
        }
        System.out.println(" arrnonChangeable = "+nonChangable[1]);
        System.out.println("int nonChangeable = "+yu);
    }
}