package chapters;

public class MultiplesOfTwoWithInfiniteLoop {
	
	//private int num;
//	
//	public String getNum() {
//		
//		int count = 1;
//		
//		String store = "";
//		
//		while(count < 4000) {
//			
//			store = store + "," + (int)Math.pow(2, count);
//			count++;
//		
//		
//		}
//		return store;
//	}
//	

	public static void main(String[] args) {

		int count = 1;
		
		String store = "";
		
		while(count > 0) {
			int num = (int)Math.pow(2, count);
			System.out.print(num + ",");
			count++;
		}
		
	}

}
