/**
 * Permutation
 */
import java.util.Scanner;
public class Permutation {

    int firstFactor, secondFactor;
    long num2 = firstFactor - secondFactor;

    public void setValue(int firstFactor, int secondFactor) {
            this.firstFactor = firstFactor;
            this.secondFactor = secondFactor;

            
    }
    public long factorialOne(long num1) {
        if(num1 <= 1) {
            return 1;
        } else {
            return num1 * factorialOne(num1 - 1);
        }

    } 

    public long factorialTwo(long num2) {
       
        if(num2 <= 1) {
            return 1;
        } else {
            return num2 * factorialTwo(num2 - 1);
        }

    }
    public static void main(String[] args) {
        Permutation adeola = new Permutation();

        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the First Value: ");
        int firstValue = input.nextInt();

        System.out.print("Enter the Second Value: ");
        int secondValue = input.nextInt();  
        
        
        adeola.setValue(firstValue, secondValue);

        long finalOne = adeola.factorialOne(firstValue);
        long finalTwo = adeola.factorialTwo(secondValue);

        // long final = finalOne / finalTwo;
        System.out.printf("%dP%d: %d",firstValue,secondValue, (finalOne / finalTwo));
        input.close();
    }
}