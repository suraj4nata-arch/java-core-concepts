package Exception;

public class try_catch_demo
{
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			int result=10/0;
			int numbers[] = {10, 20, 30};
			System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
		}
		
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		
		catch (Exception e) {
			System.out.println("Any other exceptions");
		}
		
		System.out.println("Stop");
	}
}
