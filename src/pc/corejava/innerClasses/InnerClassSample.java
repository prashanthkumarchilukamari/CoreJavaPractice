package pc.corejava.innerClasses;

 public class InnerClassSample {
		 
		private int index = 3;
		
		public void getInnerClassObj() {
			Inner innerClassObj = new Inner();
			innerClassObj.getIndexValue(); // accessing the inner class method from outer class instance method
		}

		// Regular Inner Class
		class Inner {
			public void getIndexValue() {
				
				System.out.println("Index value of the outer class is  " + index);
			}
		}
	 

	public static void main(String[] args) {
		InnerClassSample obj = new InnerClassSample();
		InnerClassSample.Inner innerclass = obj.new Inner();
		
		//InnerClassSample.Inner innerclass =  new InnerClassSample().new Inner();
		
		innerclass.getIndexValue();  // accessing the inner class method from outer class static method
	}

}
