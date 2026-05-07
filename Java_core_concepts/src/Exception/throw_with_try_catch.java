package Exception;

public class throw_with_try_catch 
{
	public static void main(String[] args) {
		try {
			int age=10;
			if(age<18) {
				throw new ArithmeticException("Not eligible to vote");
			}
		}
		catch (Exception e) {
			System.out.println("Exception handled: " + e.getMessage());
		}
	}
}
