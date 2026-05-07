package Collections;

import java.util.HashMap;
import java.util.Map;


public class Main_Collision 
{
	public static void main(String[] args) {  //(A collision happens when two different keys go to the same bucket (same index) inside a HashMap.)
		Map<Key, String> hashMap = new HashMap<>();
		hashMap.put(new Key(1), "A");
		hashMap.put(new Key(2), "B");
		hashMap.put(new Key(3), "C");
		
	}
}
