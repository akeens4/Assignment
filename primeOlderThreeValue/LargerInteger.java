import java.util.Scanner;

/**
 * LargerInteger
 */
public class LargerInteger {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the value of m:");
        int valueofM = value.nextInt();
	
	int n0 = -1;
	int n1 = 0;
	int n2 = 1; 
        
        if(valueofM < 0) {
            System.out.print("The value of m = " + valueofM + ".0\n" + "The value of n = " + n0 + "!" );
        } else if(valueofM == 0) {
            System.out.print("The value of m = " + valueofM + ".0\n" + "The value of n = " + n1 + "!");
        } else {
            System.out.print("The value of m = " + valueofM + ".0\n" + "The value of n = " + n2 + "!");
        }
    }
}