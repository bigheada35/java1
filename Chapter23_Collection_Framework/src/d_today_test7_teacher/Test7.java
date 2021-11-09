package d_today_test7_teacher;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Iterator;
public class Test7 {
	public static void main(String[] args) {
		ListIntMax lm = new ListIntMax();
		lm.getArrList();
		System.out.println("가장 큰 수는" + lm.getMax() );
	}
}

class ListIntMax{
	private ArrayList<Integer> arrList;
	
	ListIntMax(){
		arrList = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getArrList() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수(-1이 입력될 때까지)>>");
			while(true) {
				// 주의 : nextInt는 꼭 enter가 아니고 space 가 입력되어도 빠져 나온다.
				int num = sc.nextInt();
				if(num == -1)
					break;
				arrList.add(num);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			getArrList();
		}

		return arrList;
	}
	public void setArrList(ArrayList<Integer> arrList) {
		this.arrList = arrList;
	}
	public int getMax() {
		max = 0;
		for (Integer i : arrList) {
			if( i > max)
				max = i;
		}
		
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	private int max;

}
/*
### 7.Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 List에 저장하고 
### List를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.

정수(-1이 입력될 때까지)>> 10 6 22 6 88 77 -1

가장 큰 수는 88
*/