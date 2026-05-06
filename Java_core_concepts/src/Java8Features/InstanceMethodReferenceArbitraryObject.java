package Java8Features;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceArbitraryObject 
{
	public static void main(String[] args) {

        List<String> names = Arrays.asList("A", "B", "C");

        // Lambda
        names.forEach(s -> System.out.println(s));

        // Method Reference
        names.forEach(System.out::println); //Use print method directly for each item
    }
}
