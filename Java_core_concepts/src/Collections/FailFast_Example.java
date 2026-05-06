package Collections;

import java.util.ArrayList;
import java.util.List;

public class FailFast_Example 
{
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		for(String s: arrayList) {
			if(s.equals("B")) {
				arrayList.remove(s);   //modification during iteration is not acceptable
			}
		}
	}
}
