package temp_04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Test4 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		while(true) {
			int number = (int)(Math.random()*45 + 1);
			
			System.out.print(number +",");
			set.add(number);
			if(set.size() == 6) {
				break;
			}
			
		}
	}
		
}
 
