import java.util.Scanner;

public class UserInput{
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Please enter your full nume: ");
			String fullName = scan.nextLine();
			
			System.out.print("Enter your address: ");
			String address = scan.nextLine();
			
			System.out.print("Enter your age: ");
			int age = scan.nextInt();
			scan.nextLine();
			
			
			System.out.print("Enter your gender(M/F: ");
			char gender = scan.next().charAt(0);
			
			System.out.printf("Are you happy to learn Java? (True/Flase: ");
			boolean isHappy = scan.nextBoolean();
			
			//System.out.printIn("");
			//System.out.printIn("");
			
			
			System.out.printf("Hello %s , How are you today?%n",fullName);
			System.out.printf("Nice meeting you %s, you are living in %s%n", fullName,address);
			System.out.printf("I am %d years old%n",age);
			System.out.printf("You are a %s",gender);
			System.out.printf("Are you happy to learn java? %b%n ",isHappy);
		
		}
}

