
public class Encryption extends CreateArray {


	private static int[][] rndTable = null;
	
	public static void main(String[] args) {
		
		rndTable = new int[10][10];
		
		generateArray();
		
		rndTable = returnArray();
		

	}

}
