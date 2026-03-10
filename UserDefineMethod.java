public class UserDefineMethod{
	public static String userName(String name){
		
		return name;
	}
	
	public static void checkAge(int age){
		if(age >= 18){
			System.out.println(UserDefineMethod.userName("John Williams") + " You are an adult");
		}
		else{
			System.out.println(UserDefineMethod.userName("John Williams") + " You are still a minor");
		}
		
		
	}
	
	public static void main(String[] args){
		(UserDefineMethod.checkAge(25);
	}
}