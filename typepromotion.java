public class typepromotion {
    public static void main(String[] args) {
        /*type promotions happen in expressions
        1. java automatically promotes each byte, short, or char operand to int when evaluating an expression 
        2. if one operand is long, float or double the whole expression is promoted to long, float or double respectively 
        a+b*c/e   a=int , b=float, c=char , e=long 

     char a='a';
     short b=50;
     a+b =
     both a and be would be converted into int 

        */ 

        char a='a';
        char b='b';
        //further individually type casting 
        System.out.println((int)b);
        System.out.println((int)a);
        // printing promoted result
        System.out.println(b-a);
        // type promotions occurs in expressions 
    }
}
