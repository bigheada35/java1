package d_today_test7;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Test7 {
	public static void main(String[] args) {
		LargeNum ln = new LargeNum();
		ln.input();
		ln.print();
	}
}
class LargeNum{
	List<Integer> list = new ArrayList<>();  
	void input(){
		System.out.print("정수(-1이 입력될 때까지)>>");
		//while(true) {
			Scanner sc = new Scanner(System.in);
			String strlist = sc.nextLine();
			
			StringTokenizer token = new StringTokenizer(strlist, " ");
			
			int tcnt = token.countTokens();
			for(int i=0; i<tcnt; i++) {
				int intNum = Integer.valueOf(token.nextToken());
				list.add(intNum);
			}
		//}
	}
	void print() {
		int max = 0;
		for (Integer integer : list) {
			if(max < integer)
				max = integer;
		}
		System.out.println("가장 큰 수는 "+ max);
	}
}

/*
### 7.Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 List에 저장하고 
### List를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.

정수(-1이 입력될 때까지)>> 10 6 22 6 88 77 -1

가장 큰 수는 88
*/