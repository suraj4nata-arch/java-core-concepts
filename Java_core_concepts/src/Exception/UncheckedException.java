package Exception;

public class UncheckedException 
{
	public static void main(String[] args) {
		int a =10;
		int b=0;
		System.out.println(a/b);  //no need to add any exception. JVM handles itself
	}
}
