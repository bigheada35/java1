package ch23_p19_3;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

class Ex {
	// Set을 사용하여, 로또 번호 만들기
    public static void main(String[] args) {
    	for(int i=0; i<10; i++)
    		lotto();
    }
    public static void lotto() {
    	Set<Integer> set = new HashSet<>();
    	
//    	while(true){
//    		set.add((int)(Math.random()*45 + 1));
//    		if(set.size() == 6)
//    			break;
//    	}
    	
//		이런 방법도     	
    	while(set.size() != 6) {
    		set.add((int)(Math.random()*45 + 1));
    	}
    		
    	for (Integer num: set) { 
			System.out.print(num + "\t");
    	}
	
    	System.out.println(); 
    }
    
}
