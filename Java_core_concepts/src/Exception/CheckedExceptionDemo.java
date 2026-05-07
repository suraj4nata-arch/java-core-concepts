package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo 
{
	public static void main(String[] args) throws FileNotFoundException { //added FileNotFoundException using throws keyword
		FileReader file = new FileReader("test.txt"); // checked exception
	}
}
