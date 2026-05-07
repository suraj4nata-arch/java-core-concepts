package Exception;

public class Simple_Exception_example 
{
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		int c=a/b; //this gives Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(c);
	}
}
