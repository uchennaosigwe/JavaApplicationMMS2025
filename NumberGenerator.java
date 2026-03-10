import java.util.Random;

public class NumberGenerator{
	public static void main(String[] args){
		Random rand = new Random();
		
		// Any integar
		System.out.println(rand.nextInt());
		
		//generate a specified number
		System.out.println(rand.nextInt(20)+1);
		
		//generate any double
		System.out.println(rand.nextDouble());
		
		//generate any boolean
		System.out.println(rand.nextBoolean());
		
		
		//use the random clas to generate an 18 digit password that contains number,symbols,characters.
	}
}