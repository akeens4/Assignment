
import java.util.Scanner;
public class YthRoot2 {
     
    public static double calculateYthRootOfX(int n, int m) {
         
    double root = 1.00;

    double num1 = n;
    double num2 = m;
     
    for (int i = 0; i < num1 - 2; i++) {
         
        root = (1/num2) * (root + num1/root);
    }   
     
    //To make only 3 digit available after decimal point
    int returnValue = (int)(root * 1000);  
    
    root = returnValue;
    root /=1000;
     
    System.out.println("Root Value Calculated : " + root);

     
    return root;
     
    }
     
     
    public static void main (String[] args) {
         
        int n, m;
         
        Scanner input = new Scanner(System.in);        
         
        System.out.println("Enter Number to find its yth root-");
        n = input.nextInt();

        System.out.println("Enter the root-");
        m = input.nextInt();
        calculateYthRootOfX(n,m);
        input.close();
    }
 
}