package t_today_test7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Test7 {

	public static void main(String[] args) {
			Map<Integer, String> map = new HashMap<>();
		   map.put(45, "Brown");
		   map.put(37, "James");
		   map.put(23, "Martin");
		   
		   Set<Integer> set = map.keySet();
		   Iterator<Integer> ite = set.iterator();
		   for( ; ite.hasNext(); ) {
			   Integer i = ite.next();
			   System.out.println(i+","+ map.get(i));
		   }

		//======================================
		//위의 Value 값이 다나오도록 for 문 돌리시오.
	}

}

