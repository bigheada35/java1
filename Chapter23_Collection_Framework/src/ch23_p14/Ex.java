package ch23_p14;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Ex {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box" );
        list = new ArrayList<>(list);
        
        ListIterator<String> litr = list.listIterator();
        //Iterator<String> list2 = list.
        String str;
 
        while(litr.hasNext()) {
        	str = litr.next();
        	System.out.println(str + '\t');
        	if(str.equals("Toy"))
        		litr.add("Toy2");
        }
        System.out.println();
        
        
    }
}
