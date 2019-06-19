package chapters;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to Reverse: ");
        int num = input.nextInt();
        int num1 = num;
        int reversed = 0;
        int digit = 0;
        
        
      while(num != 0) {
    	        digit = num % 10;
	        reversed = (reversed * 10) + digit; 
	        num /= 10;
      }
    
                
        // for(;num != 0; num /= 10) {
        //     digit = num % 10;
        //     reversed = (reversed * 10) + digit;             
                
        //     }
           // System.out.println("Reversed Number:" + reversed);
            if(num1 == reversed){
                System.out.print("It is Palindrome");
            } else {
                System.out.print("Not Palindrome!!!");
            }
            
            //System.out.println((num == reversed) ? " is palindrome" : "It is not a palindrome");
            input.close();
        }

}
