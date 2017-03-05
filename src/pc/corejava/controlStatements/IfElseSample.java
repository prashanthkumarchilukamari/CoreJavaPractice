package pc.corejava.controlStatements;

public class IfElseSample {
	public static void main(String[] args) {

		System.out.println(" Scenario 1 - If condition ");

		double javaVersion = 1.0;
		if (javaVersion < 1.4) {
			System.out.print("Very old version of java");
		}

		System.out.println("\n  Scenarion 2 - IF - Else Condition ");

		int num = 26;
		if (num % 2 == 0) {
			System.out.println("Given number "+num + " is even");
		} else {
			System.out.println("Given number "+num + " is odd");
		}

		System.out.println("Scenarion 3 - Nested IF - Else Condition");

		javaVersion = 1.4;
		if (javaVersion < 1.6) {
			if (javaVersion < 1.8) {
				System.out.println("Please upgrade to the next version ");
			}
		} else {
			System.out.println("You are using very old java version");
		}

	}

}
