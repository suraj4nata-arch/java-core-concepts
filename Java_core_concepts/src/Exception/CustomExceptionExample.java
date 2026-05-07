package Exception;

public class CustomExceptionExample 
{
	static void checkAge(int age) throws InvalidAgeException {
		if(age < 19) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
		System.out.println("Eligible to vote");
	}
	
	public static void main(String[] args) {
		try {
			checkAge(15);
		}
		catch (InvalidAgeException e) {
			System.out.println("Custom Exception Handled");

            System.out.println(e.getMessage());
		}
	}
}
