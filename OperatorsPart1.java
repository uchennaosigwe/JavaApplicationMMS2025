public class OperatorsPart1{
	public static void main(String[] args){
		//assignment operator(=)
		int num = 50;
		System.out.printf("the value of num is %d",num);
		
		//Arithmetic Operators(+,-,*,/,%)
		int num1 = 100;
		int num2 = 500;
		
		int addition = num1 + num2;
		
		System.out.printf("The sum of %d and %d is %d%n",num1,num2,addition);
		
		int subtraction = num1 - num2;
		System.out.printf("The different between %d and %d is %d%n",num1,num2,subtraction);
		
		int multiplication = num1 * num2;
		System.out.printf("The product of %d and %d is %d%n",num1,num2,multiplication);
		
		double quotient = (double)num1/num2;
		System.out.printf("The quotient of %d divided by %d is %f%n",num1,num2,quotient);
		
		//int remainder = num1%num2;
		//System.out.printf("The remainder between %d % %d is %d%n",num1,num2,remainder);

		//Compound assignment operator
		num1 += num2;
		System.out.printf("The value of num1 is %d%n",num1);
		
		num1 *= num2;
		System.out.printf("The value of num1 is %d%n",num1);
		
		num1 /= num2;
		System.out.printf("The value of num1 is %d%n",num1);
		
		num1 -= num2;
		System.out.printf("The value of num1 is %d%n",num1);
		
		num1 %= num2;
		System.out.printf("The value of num1 is %d%n",num1);
		
		//Relational operator(>,<,>=,<=,!=,==)
		int number1 = 20, number2 = 50;
		
		boolean isGreater = number1 > number2;
		System.out.printf("Is %d > %d? %b%n",number1,number2,isGreater);
		
		boolean isLessthan = number1 < number2;
		System.out.printf("Is %d < %d? %b%n",number1,number2,isLessthan);
		
		boolean isGreaterThanOrEqualto = number1 >= number2;
		System.out.printf("Is %d >= %d? %b%n",number1,number2,isGreaterThanOrEqualto);
		
		boolean isLessThanOrEqualto = number1 <= number2;
		System.out.printf("Is %d <= %d? %b%n",number1,number2,isLessThanOrEqualto);
		
		boolean isNotEqualto = number1 != number2;
		System.out.printf("Is %d != %d? %b%n",number1,number2,isNotEqualto);
		
		boolean isEqualto = number1 == number2;
		System.out.printf("Is %d == %d? %b%n",number1,number2,isEqualto);
	}
}