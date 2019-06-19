package chapters;

public class Tabular {

	public static void main(String[] args) {

		int count = 1;

		
		while(count <= 5) {
			if(count == 1) {
				System.out.printf("%s\t%s\t%s\t%s%n","N","10*N","100*N","1000*N");
				System.out.print("\n");
			}
			System.out.printf("%d\t%d\t%d\t%d%n",(count * 1),(count * 10),(count * 100),(count * 1000));
			count++;
		}
		

	}

}
