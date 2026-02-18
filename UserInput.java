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
			//System.out.printin("");
			
			
			System.out.printf("Hello %s , How are you today?",fullName);
			System.out.printf("Nice meeting you %s, you are living in %s", fullName,address);
			System.out.printf("I am %d years old",age);
		
		}
}

