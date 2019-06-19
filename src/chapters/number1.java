package chapters;

public class number1 {

	public static void main(String[] args) {
	
		int total = 0;
		int x = 1;
		int y = 0;
		System.out.print("number    squarenumber\n\n");
		while(x <= 10) {
			y = x * x;
			
			System.out.printf("%d             %d%n",x,y);
			total += y; 
			++x;
		}
		System.out.printf("%n%nThe square of number from 1-10 is: %d",total);
	}

}
