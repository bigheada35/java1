package t30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test30 {
	public static void main(String[] args) {
	
		Set<Integer> set = new HashSet<>();
		while(true) {
			int num = (int)(Math.random()*45 + 1);
			set.add(num);
			if(set.size() == 6)
				break;
		}
		
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + ",");
		}
		System.out.println();
		Iterator<Integer> iter = set.iterator();
		for(; iter.hasNext(); ) {
			System.out.print(  iter.next() + ",");
		}
	}
}

/*

*/