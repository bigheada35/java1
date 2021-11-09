package e_today_test2_lotto;

import java.util.Set;
import java.util.Iterator;


import java.util.HashSet;
public class Test2 {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		while(set.size() != 6) {
			int num = (int)(Math.random()*45 + 1);
			set.add(num);
		}
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print( iter.next() +"\t");
		}
			
	}


}



