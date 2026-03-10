import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Calculate the area of a Square");
		System.out.println("2. Calculate the area of a Rectangle");
		System.out.println("3. Calculate the area of a Triangle");
		
		System.out.print("Enter your choice ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
				System.out.print("Enter the length of the square ");
				int squareLength = input.nextInt();
				
				MethodOverLoading.area(squareLength);
			break;
			
			case 2:
				System.out.print("Enter the length of the rectangle ");
				int rectangleLength = input.nextInt();
				
				System.out.print("Enter the breadth of the rectangle ");
				int BreadthLength = input.nextInt();
				
				MethodOverLoading.area(rectangleLength,BreadthLength);
			break;
			
			case 3:
				System.out.print("Enter the length of the triangle ");
				int triangleleLength = input.nextInt();
				
				System.out.print("Enter the base of the triangle ");
				double base = input.nextDouble();
				
				MethodOverLoading.area(triangleleLength,base);
			break;
			
			default:
				System.out.print("invalid input");
		}
	}
	
	public static void area(int length){
		int areaOfSquare = (int)Math.pow(length,2);
		System.out.printf("The are of the square is %d",areaOfSquare);
	}
	
	public static void area(int length,int breadth){
		int areaOfRectangle = length * breadth;
		System.out.printf("The area of the rectangle is %d",areaOfRectangle);
	}

	public static void area(int length,double base){
		double areaOfTriangle = 0.5 * length * base;
		System.out.printf("The area of the triangle is %.2f",areaOfTriangle);
	}
}