package t48;

import java.util.ArrayList;
import java.util.List;

public class Test48 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++)
		{
			list.add(i);
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
//ArrayList 에 1부터 10까지 차례대로 입력후 출력하시오,

