package ch23_p17;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Ex {
    public static void main(String[] args) {
    	List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
    	list = new ArrayList<>(list);
    	
    	ListIterator<String> litr = list.listIterator();//
    	
    	 String str;
    	 while(litr.hasNext()) {
    		 str= litr.next();
    		 System.out.print(str + "\t");
    		 if(str.equals("Toy")) {
    			 litr.add("Toy2");
    		 }
    	 }
    	 System.out.println();
    	 litr = list.listIterator();
    	 
    	 while(litr.hasNext()) {
    		 System.out.println(litr.next() + "--");
    	 }
    	 System.out.println();
    	 
    	 while(litr.hasPrevious()) {
    		 str = litr.previous();
    		 System.out.print(str + "\t");
    		 if(str.equals("Robot"))
    			 litr.add("Robot2");
    	 }
        
    	 System.out.println();   
    	 while(litr.hasNext()) {
    		 System.out.println(litr.next() + "==");
    	 }
    	 System.out.println();    	 
    	 
    }
}
