package pc.corejava.Exceptions;

public class NestedTryBlockSample {

	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			try 
			{				
			System.out.println( args[i]);// comment this line to execute inner try-catch

				try 
				{
					int result = 26/0;
					
				} catch (ArithmeticException ex) 
				{
					System.out.println("Handle the Arithmetic exception here");
				}
			} catch (ArrayIndexOutOfBoundsException ex) 
			{
				System.out.println("Handle the Array IndexOut Of Bounds Exception here");
			}
		}

	}

}
