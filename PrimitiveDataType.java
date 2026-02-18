public class PrimitiveDataType{
	public static void main (String[] args){
		byte age = 30;
		System.out.printf("I am %d Years Old%n",age);
		
		short quantityOfBags = 10000;
		System.out.printf("The quantity of bags ordered is %d%n",quantityOfBags);
		
		int nigeriaPopulation = 200000000; 
		System.out.printf("The populationof Nigeria is %d%n",nigeriaPopulation);
		
		long worldsPopulation = 900000000L;
		System.out.printf("The worlds Population is %d%n",worldsPopulation);
		
		
		
		//float-point primitive data type
		float myBalance = 6945.6000057F;
		System.out.printf("My Account balance is %.2f%n",myBalance);
		
		double cBNBalance = 98874466464.904;
		System.out.printf("CBN account balance %f%n",cBNBalance);
		
		
		// single character primitive datatype
		char symbol = '$';
		System.out.printf("My Account balance is %c%.2f%n",symbol,myBalance);
		
		//boolean primitive data type
		boolean isJavaFun = true;
		System.out.printf("Do you love learning Java? %b%n", isJavaFun);
		
	}
}