package pc.corejava.controlStatements;

public class SwitchCaseSample {

	public static void main(String[] args) {
		
		
		System.out.println("Scenario - 1");
		String s = "vivan";
		for (char c : s.toCharArray())
		{
			switch (c)
			{
			case 'v':
				System.out.println("character v is matched");
				break;
				
			case 'i':
				System.out.println("character i is matched");
				break;

			case 'a':
				System.out.println("character a is matched");
				break;			

			case 'n':
				System.out.println("character n is matched");
				break;	

			default:
				System.out.println("character *****  is matched");

			}

		}
		
		System.out.println("Scenario - 2 --> fall through inside the switch ");
		
		int index=10;  //Change the value of index to 20 and test it again
	    switch(index){  
	    case 10: 
	    	System.out.println("Index value is 10");  
	    case 20: 
	    	System.out.println("Index value is 20");  
	    case 30: 
	    	System.out.println("Index value is 30");  
	    default:
	    	System.out.println("Index value is out of range");  
	    }  
	    

	}

}




