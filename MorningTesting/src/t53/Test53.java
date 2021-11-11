package t53;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test53 {
	public static void main(String[] args) {

		   HashMap<Integer, String> map = new HashMap<>();
		   map.put(45, "Brown");
		   map.put(37, "James");
		   map.put(23, "Martin");	
		   //set
		   Set<Integer> set = map.keySet();
		   //iterator
		   Iterator<Integer> iter = set.iterator();
		   
		   while(iter.hasNext()) {
			   Integer i = iter.next();
			   System.out.println(i + ", " + map.get(i));
			   
		   }
	}
}

/*
 * 위의 Value 값이 다나오도록 for 문 돌리시오.

*/
