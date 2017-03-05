package pc.corejava.fundamentals;

// scenario - 3 -- > final class
/* final */  class AudioSystem { // IF we declare class as final, we can't extend it

	// scenario - 1 -- > final variable
/*	final */ int price = 10000;
	
	public void updatePrice(){
       price = 20000;  // if the price is final will get CTE 
	}

	// scenario - 2 -- > final method
	
	/* final */  public void displayPrice(){
		System.out.println("If we declare this method as final then we can't override in child class");
	}
}

class SonyAudioSystem extends AudioSystem{

	
	public void displayPrice(){
		System.out.println("CTE : remove final keyword from the parent");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
