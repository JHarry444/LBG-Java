package staticy;

public class App {

	public static void main(String[] args) {
		Person p = new Person("Jordan", 29, "Weapon");
//		p.latinName = "Homo Superior";
//		System.out.println(p.latinName);

		Person p2 = new Person("Piers", 22, "Annoying me");
//		System.out.println(p2.latinName);

		System.out.println(Person.getLatinName());

	}
}
