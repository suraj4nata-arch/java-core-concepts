package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class with_and_without_streams {

	public static void main(String[] args) {
		
		//without streams
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
//        List<Integer> result = new ArrayList<>();
//
//        for(int num : numbers) {
//            if(num % 2 == 0) {
//                result.add(num * 2);
//            }
//        }
//
//        System.out.println(result);
		 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);  //list of numbers

        List<Integer> result = numbers.stream() //converting list to stream ((flow of data)
                                     .filter(n -> n % 2 == 0) //like an if condition--> It keeps only even numbers.
                                     .map(n -> n * 2) //doubles the number
                                     .collect(Collectors.toList());  //It collects the processed data back into a List.

        System.out.println(result);
    }
}
