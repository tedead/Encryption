import java.util.Random;

public class CreateArray {
	
	private static int[][] encArray = null;

	private int[][] tempEncArray = null;
	
	private static Random seed = null;
	
	private static String holder = "";
	
	private static int rnd = 0;

	private static int fiveRnd = 0;

	private int rndGenerated = 0;
	
	public CreateArray() {
		
		this.encArray = generateArray();
		
	}
	
	protected static int[][] generateArray() {
		
		encArray = new int[10][10];
		
		for (int rows = 0; rows < encArray.length; rows++) {
			
			for(int cols = 0; cols < encArray[0].length; cols++) {
				
				encArray[rows][cols] = generateFive();
			
			}
		
		}
		
		return encArray;
	}
	
	public static int[][] returnArray() {
		
		return encArray;
		
	}
	
	private static int generateFive() {
		
		holder = new String();
		
		for (int x = 0; x < 5; x++) {
			
			rnd = randomGenerator();
			
			holder += rnd;
			
		}
		
		try {
			
			fiveRnd = Integer.parseInt(holder);
			
		} catch(Exception e) {
			
			try {
				
				throw new Exception(e);
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			
		}
		
		return fiveRnd;
	}
	
	private static int randomGenerator() {
		
		Random x = new Random();
		
		seed = null;
		
		seed = new Random(x.nextInt());
	
        return seed.nextInt(9);
        
	}


}
