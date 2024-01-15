package flow.of.control;

public class Exercises {

	public static void main(String[] args) {
//		for (int i = 1; i <= 20; i++) {
//			System.out.println(fizzBuzz(i));
//		}
//		for (int i = 10; i <= 99; i++) {
//			System.out.println("I: " + i + " SUM: " + sumDigits(i));
//		}
		for (int i = 1; i < 100; i++) {
			System.out.println("I: " + i + " Text: " + numToString(i));
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

	public static int sumDigits(int num) {
		if (num < 10 || num > 99)
			return -1; // basically an error
		int sum = 0;
		int tens = num / 10;
		int units = num % 10;

		sum = tens + units;
		return sum;
	}

	public static String numToString(int num) {
		String out = "";
		String[] tensArray = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		String[] unitsArray = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] teensArray = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };

		int tens = num / 10;
		int units = num % 10;

		if (num > 10 && num < 20) {
			out += teensArray[units];
		} else {
			out += tensArray[tens];

			if (tens > 1 && units > 0)
				out += "-";

			out += unitsArray[units];
		}
		return out;
	}

}
