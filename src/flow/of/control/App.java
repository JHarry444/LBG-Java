package flow.of.control;

import java.util.Iterator;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		if (2 > 6) {
			System.out.println("DO THIS!");
		} else {
			System.out.println("DO THAT");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int rand = 2;
		while (rand != 2) {
			rand = new Random().nextInt(3);
			System.out.println(rand);
		}
		
		do {
			rand = new Random().nextInt(3);
			System.out.println(rand);
		} while (rand != 2);
	}

}
