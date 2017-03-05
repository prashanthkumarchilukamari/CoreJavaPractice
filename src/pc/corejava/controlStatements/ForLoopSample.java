package pc.corejava.controlStatements;

public class ForLoopSample {
	public static void main(String[] args) {

		System.out.println("Scenarion - 1");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Counter Value is : " + i);
		}
		
		
		System.out.println("Scenarion - 2");
		int j = 10;
		for (int i = 1; i <= 10; i++, j--) {
			System.out.println("i Value is : " + i + " and J value is " + j);
		}

		// For - Each Loop
		System.out.println("Scenarion - 3");
		String[] stringArr = new String[] { "Vivan", "Shanth", "Sathish" };
		for (String str : stringArr) {
			System.out.println(str);
		}

	}

}
