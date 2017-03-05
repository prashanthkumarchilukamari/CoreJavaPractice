package pc.corejava.string;

public class StringSample {

	public static void main(String[] args) {

		//String Objects are stored in String Constant Pool.
		
		String str1 = "Vivan"; // String instance will be created in SCP
		String str2 = "Vivan"; // Duplicate instances are Not allowed inside the SCP - So it will not create new instance.
		// The above references str1 and str2 will point to SCP memory object.
		
		
		String str3 = new String("Vivan"); // It creates two objects one in SCP and another one in HEAP.
		// The above reference str3 will point to HEAP memory object.

		if (str1 == str2){
			System.out.println("str1 and str2 references are equal");
		}
		
		if (str1 == str3){
			System.out.println("str1 and str3 references are equal");
		}else{
			System.out.println("str1 and str3 references are NOT equal");
		}
		
		if (str1.equals(str3)){
			System.out.println("str1 and str3 contents are equal");
		}
		
		String str4 = "Vivan" + 2016; // Here '+' operand acts as a concatenation operator 
		System.out.println("Value of Str4 is : " + str4);
		
		
		str1.concat(" Shanth"); //String objects are immutable
		System.out.println("String objects are immutable.. So the value of Str1 is : " + str1);
		
		str2 = str1.concat(" Shanth"); // In built concat() method
		System.out.println("Value of Str5 is : " + str2);
		
		System.out.println(str2.substring(0,5)); // Before 1.7version substring causes the memory leak issues.  
		
		String str5="";
		System.out.println("Is str5 is empty  -- "+str5.isEmpty()) ;
		System.out.println("length of str5 is : "+str5.length());
		
		
		String str6 = "007";        
        int integerValue = Integer.valueOf(str6);         
        System.out.println("The int value of str6 is : " +integerValue);    
        

        // Converting integer to string 
        String str7 = String.valueOf(integerValue);         
        System.out.println("The string value of str7 is  :  "+ str7 );     




	}

}
