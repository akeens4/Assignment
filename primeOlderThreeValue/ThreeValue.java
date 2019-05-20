/**
 * ThreeValue
 */
import java.util.Scanner;
public class ThreeValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Enter first value: ");
            int firstValue = input.nextInt();

            System.out.print("Enter second value: ");
            int secondValue = input.nextInt();

            System.out.print("Enter third value: ");
            int thirdValue = input.nextInt();

            if(thirdValue > secondValue ) {
                System.out.print(thirdValue);
            } else if(secondValue > firstValue) {
                System.out.print(secondValue);
            } else {
                System.out.print(firstValue);
            }

        input.close();
    }
}