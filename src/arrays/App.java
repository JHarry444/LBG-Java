package arrays;

public class App {

	public static void main(String[] args) {
		int num = 0;
		// creates a blank array 10 long
		int[] nums = new int[10];

		System.out.println("9: " + nums[9]);
		// can''t really print out arrays directly
		System.out.println("Nums: " + nums);

		nums[3] = 17;
		for (int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + " NUM: " + nums[i]);
		}

//		String[] words = new String[5];
		String[] words = { "Jordan", "Cameron", "Adam", "Andrew", "Piers" };

		for (int i = 0; i < words.length; i++) {
			System.out.println("I: " + i + " WORD: " + words[i]);
		}
	}

}
