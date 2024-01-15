package flow.of.control;

public class Exercises {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			System.out.println(fizzBuzz(i));
		}
	}

//	public static String fizzBuzz(int num) {
//		if (num % 3 == 0 && num % 5 == 0) {
//			return "FizzBuzz";
//		} else if (num % 3 == 0) {
//			return "Fizz";
//		} else if (num % 5 == 0) {
//			return "Buzz";
//		} else {
////			return "" + num;
//			return String.valueOf(num);
//		}
//	}

	public static String fizzBuzz(int num) {
		String output = "";
		if (num % 3 == 0)
			output += "Fizz";
		if (num % 5 == 0)
			output += "Buzz";
		if (num % 10 == 0)
			output += "Yowzer";

		if (output.length() == 0)
			output += num;

		return output;
	}

}
