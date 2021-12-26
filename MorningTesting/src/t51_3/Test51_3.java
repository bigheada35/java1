package t51_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test51_3 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		while(true) {
			int num = (int)(Math.random()*45 + 1);
			
			set.add(num);
			if(set.size() >= 6) {
				break;
			}
			
		}

		System.out.println(set.iterator());
		for (Integer i : set) {
			System.out.print(i  + ", " );
		}
//---------------------- test ------------------------------
		for (Integer i : set) {
			System.out.print(i  + ", " );
		}

		System.out.println("--1---");
		System.out.println(set.toString());
		System.out.println("--1---");
		
		System.out.println(set.hashCode());
		
		
		
		

	}

}
