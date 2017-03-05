package pc.corejava.innerClasses;

class BMWCar
{
    void getGearSystem()
    {
    	int noOfGears = 5;
    	final int defaultNumberOfGears = 5;    	
    
        class AutoMaticGearSystem // Method Local Inner Class
        {
            int gearIndex;     //Non-static field
 
            static final int defaultGearIndex = 10; //static and final field
 
            void displayCarInfo()
            {
                System.out.println("Method Local Inner Class");
                System.out.println("Non - final variable value "+ noOfGears + " Final variable value " + defaultNumberOfGears);
            }
        }
 
        new AutoMaticGearSystem().displayCarInfo();
    }
}
 
public class MethodLocalInnerClasssDemo
{
    public static void main(String args[])
    {
    	BMWCar outerClassObj = new BMWCar();
        outerClassObj.getGearSystem();
    }
}