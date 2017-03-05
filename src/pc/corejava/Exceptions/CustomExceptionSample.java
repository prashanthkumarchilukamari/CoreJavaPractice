package pc.corejava.Exceptions;

class InvalidJavaVersion extends Exception {
	private String errorMessage = null;
	
    public InvalidJavaVersion() {
        super();
    }

    public InvalidJavaVersion(String errorInfo) {
        super(errorInfo);
        this.errorMessage = errorInfo;
    }

    @Override
    public String toString() {
        return errorMessage;
    }

}

public class CustomExceptionSample {
	public static void main(String[] args){
		try {
			CustomExceptionSample.validateJavaVersion(1.6);
		} catch (InvalidJavaVersion e) {
			System.out.println("Custom Exception Raised ..." + e.getMessage());
		}
	}

	private static void validateJavaVersion(double javaVersion) throws InvalidJavaVersion {
		
		if(javaVersion < 1.9){
			throw new InvalidJavaVersion("Current Java Version is 1.8");
		}
		
		
	}
}
