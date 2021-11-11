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
		   for(Iterator<Integer> iter = map.keySet().iterator(); iter.hasNext() ; ) {
			   Integer i = iter.next();
			   System.out.println(i+"," + map.get(i));
			   
		   }
		   System.out.println("==use Entry == --1-");
		   Set<HashMap.Entry<Integer, String>> set = map.entrySet();
		   Iterator<HashMap.Entry<Integer, String>> itr = set.iterator();
		   while(itr.hasNext()) {
			   HashMap.Entry<Integer, String> entr = itr.next();
			   System.out.println(entr.getKey() + "," + entr.getValue());
		   }
		   System.out.println("-2-");
		   Set<HashMap.Entry<Integer, String>> set2 = map.entrySet();
		   Iterator<HashMap.Entry<Integer, String>> itr2 = set.iterator();
		   while(itr.hasNext()) {
			   HashMap.Entry<Integer, String> entr = itr.next();
			   System.out.println(entr.getKey() + "," + entr.getValue());
		   }
		   
		   
	}
}

/*
 * 위의 Value 값이 다나오도록 for 문 돌리시오.

*/
