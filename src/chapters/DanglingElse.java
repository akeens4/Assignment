package chapters;

public class DanglingElse {

	public static void main(String[] args) {
		
		int x = 11;
		int y = 9;
		
		if(x < 10)
			if(y > 10)
				System.out.println("*****");
		
			else
				System.out.print("#####");
				System.out.print("$$$$$");

	}

}
