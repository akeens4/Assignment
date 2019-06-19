package chapters;
import java.util.Scanner;
public class TwoLargest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 1;
		int largest1 = 0;
		int largest2 = 0;
		int number = 0;
		
		while(count <= 10) {
			System.out.print("Enter value: ");
			number = input.nextInt();
			
			if(number > largest1) {
				largest2 = largest1;
				largest1 = number;
			}
			else {
				if(number > largest2) {
					number = largest2;
				}
			}
			count++;
			
		}
		System.out.print("The largest number: " + largest1 + "\n");
		System.out.print("The second largest number: " + largest2);
		input.close();

	}

}
