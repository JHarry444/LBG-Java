package types;

public class App {

	
	public static void main(String[] args) {
		byte byt = 25;
		short shrt = 255;
		int i = 2_100_000_000;
//		Without the L Java thinks it's an int
		long l = 99999999999999999L;
		// Need the f or Java thinks it's a double
		float f = 44.94F;
		double d = 44.94;
		
		boolean b = false;
		
		// '' for chars and "" for strings
		char c = 'j';
		String s = "Jordan";
	
		// Primitives can never be null
		s = null;
		
	}
}
