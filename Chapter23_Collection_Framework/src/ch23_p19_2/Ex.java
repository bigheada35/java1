package ch23_p19_2;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

class Ex {
    public static void main(String[] args) {
    	
    	Set<String> set = new HashSet<>();
    	
    	set.add("Toy");   
    	set.add("Box");
    	set.add("Robot");   
    	set.add("Box");
    	System.out.println("인스턴스 수: " + set.size());
    	
    	for(Iterator<String> itr = set.iterator(); itr.hasNext(); ){
    		// 왜 '\t'는 않될까??? string만 들어가야 해서??
    		System.out.print(itr.next() + "\t");
    	}
    	
    	Iterator<String> itr2 = set.iterator();
    	while(itr2.hasNext()) {
    		System.out.print(itr2.next() + "\t");
    	}
    	System.out.println();
    	
    	for (String s : set) {
			System.out.print(s + "\t");
		}
    	System.out.println();
    	
    		
    }
}
