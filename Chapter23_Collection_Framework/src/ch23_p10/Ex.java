package ch23_p10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		   list.add("Toy");
		   list.add("Box");
		   list.add("Robot");
		   
		   Iterator<String> itr = list.iterator();   
		   // 반복자 획득, itr이 지팡이를 참조한다.
		   
		   while(itr.hasNext()) {    
			   String str = itr.next();
			   System.out.println(str);
		   }
	}

}
