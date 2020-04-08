package rubricaTelefonica;

public class Main {

	public static void main(String[] args) {
		Rubrica test = new Rubrica("mia");

		test.add("Federica", "Persiani", 2345476);
		test.add("Mario", "Merola", 2345476);
		test.add("Gianni", "Sperti", 2345476);
		test.add("Oreste", "La Peste", 2345476);
		System.out.println(test.first());

		System.out.println(test);

		System.out.println(test.find("Damiano"));
		System.out.println(test.find("Merola"));
	}

}
