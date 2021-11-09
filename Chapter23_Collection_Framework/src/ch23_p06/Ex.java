package ch23_p06;

import java.util.List;
import java.util.ArrayList;
public class Ex {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + '\t');
		}
		System.out.println();
		list.remove(0);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + '\t');
		}
		System.out.println();

	}

}
