package t48_2;

import java.util.ArrayList;
import java.util.List;

public class Test48_2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<>();
		
		for(int i =0; i<10; i++) {
			alist.add(i+1);
			
		}
		
		for (Integer i : alist) {
			System.out.println(i + ",");
		}
		
	}

}
//ArrayList 에 1부터 10까지 차례대로 입력후 출력하시오,

