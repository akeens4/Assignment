package chapters;
import java.util.Scanner;
public class Cryptography {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Four-digit value: ");
		int fourDigit = input.nextInt();
		//int count = 1;
		String store = "";
		
		while(fourDigit != 0) {
			int digit = fourDigit % 10;
			digit += 7;
			digit %= 10;
			store = digit + "" + store;
			
			fourDigit /= 10;
			//--count;
		}
//		for(;fourDigit != 0; fourDigit += 7) {
//			int 
//		}
		System.out.print(store);
		System.out.println();
		
		int store1 = Integer.parseInt(store);
		
//		int value1 = store1 / 1000;
//		
//		value1  
		 int value4 = store1 % 10;
		 store1 /= 10;
		 int value3 = store1 % 10;
		 store1 /= 10;
		 int value2 = store1 % 10;
		 store1 /= 10;
		 int value1 = store1 % 10;
		 
		 String numw = value3 + "" + value4 +""+ value1 +""+ value2;
		 System.out.println(numw);
		
		input.close();
	}

}
