package chapters;
import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		int count = 1;
		int largest = 0;
		
		while(count <= 10) {
			System.out.print("Input number here: ");
			number = input.nextInt();
			if(number > largest) {
				largest = number;				
			}
			count++;
		}
//		for(int count = 0; count < 10; count++) {
//			System.out.print("Input number here: ");
//			number = input.nextInt();
//			if(number > largest) {
//				largest = number;				
//			}
//		}
		System.out.print("\n"+ "The largest number of the 10 numbers is: " + largest);
		input.close();
	}

}
