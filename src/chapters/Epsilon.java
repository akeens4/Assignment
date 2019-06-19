package chapters;
import java.util.Scanner;
public class Epsilon {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

//		
//		System.out.print("Enter number to get: ");
//		int number = input.nextInt();
//		
//		int count2 = number - 1;
//		while(count2 > 1) {
//			if(number == 0) {
//				number = 1;
//			}else {
//			number *= count2;
//			}
//			count2--;
//		}
		
		
		
		System.out.print("Enter number: ");
		int numberOfTerms = input.nextInt();
		int x = input.nextInt();
		double store = 1;
		int number = 1;
		int count = numberOfTerms - 1;
		while(count > 1) {

				number = 1 + ( x * number/count);  
			
			--count;
		}
		//int correct = 1 + store;
		System.out.println();
		System.out.print(number);
		input.close();
	}

}
