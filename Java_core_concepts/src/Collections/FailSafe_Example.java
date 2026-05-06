package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe_Example 
{
	public static void main(String[] args) {
		List<String> arrayList = new CopyOnWriteArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		for(String s: arrayList) {
			if(s.equals("B")) {
				arrayList.remove(s);   // no error
			}
		}
		
		System.out.println(arrayList);
	}
}
