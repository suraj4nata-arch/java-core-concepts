package Exception;

public class Finally_without_exception 
{
	public static void main(String[] args) {
		try {
			int result = 10/2;
			System.out.println(result);
		}
		
		finally {
			System.out.println("Finally block executed");
		}
	}
}
