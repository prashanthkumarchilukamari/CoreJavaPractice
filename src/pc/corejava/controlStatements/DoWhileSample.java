package pc.corejava.controlStatements;

public class DoWhileSample {
	public static void main(String[] args) {
		int counter = 1;
		do {
			System.out.println("Counter value is " +counter);
			counter++;
		} while (counter <= 10);
	}
}
