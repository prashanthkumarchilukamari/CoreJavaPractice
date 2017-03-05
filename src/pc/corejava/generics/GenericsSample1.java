package pc.corejava.generics;

public class GenericsSample1 {

	//Here T  - is a type parameter and the allowed values are Objects only  but not primitives.
	class GenericsDemo<T> 
	{
	    T t;
	 
	    public GenericsDemo(T t)
	    {
	        this.t = t;
	    }
	 
	    public void setT(T t)
	    {
	        this.t = t;
	    }
	 
	    public T getT()
	    {
	        return t;
	    }
	}
	
	
	public static void main(String[] args) {
		
	}

}
