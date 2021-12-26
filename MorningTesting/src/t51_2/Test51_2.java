package t51_2;

import java.util.HashSet;
import java.util.Set;

public class Test51_2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		
		while(true) {
			int num = (int)(Math.random()*45 + 1);
			set.add(num);
			if(set.size() >= 6) 
				break;
			
		}
		
		for (Integer i : set) {
			System.out.println(i + ", ");
		}
		

	}

}
