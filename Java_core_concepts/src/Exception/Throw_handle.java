package Exception;

public class Throw_handle {
	public static void main(String[] args) {
		
			int age=10;
			if(age<18) {
				throw new ArithmeticException("Not eligible to vote");
			}
			
			System.out.println("Eligible");
		
		
	}
}
