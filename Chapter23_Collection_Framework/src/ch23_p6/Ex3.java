package ch23_p6;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Ex3 {

	public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
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
