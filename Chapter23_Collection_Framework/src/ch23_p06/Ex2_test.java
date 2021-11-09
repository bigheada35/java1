package ch23_p06;

import java.util.List;
import java.util.ArrayList;
public class Ex2_test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			list.add(i);
		}
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
		//for (Integer integer : list) {
			//주의 : 이땐 어떻게 하지 ???
		//	System.out.println(integer.get() + " ");
		//}
		for(int i = 0; i< list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		
	}

}
