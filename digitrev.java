public class digitrev {
    public static void main(String[] args) {

        int num = 1234, reversed = 0; 
        int revSum = 0;
        int checkNum=num;
        System.out.println("Original Number: " + num);
    
        // run loop until num becomes 0
        while(num != 0) {
        
          // get last digit from num
          int digit = num % 10;
          revSum=revSum+digit;
          reversed = reversed * 10 + digit;
    
          // remove the last digit from num
          num /= 10;
         // System.out.println("reversesed digit sum is:"+revSum);
        }
        
        System.out.println("Reverse sum: " + revSum);
        if(checkNum==reversed){
            System.out.println("true");
        }else{System.out.println("false");}
      }
    
}
