/*
 Rectangle 을 배열로 3개 선언

해당 객체에 인덱스 순서대로 가로 세로 설정 - 
이번에는 반드시 scanner 로 입력 받을것

해당 배열에 있는 Rectangle 의 총넓이의 합을 구하시오.

또한 아래의 함수도 만들것(static 으로 만들것)
- 파라미터를 Rectangle 배열로 받아서 해당 배열에 들어 잇는 
Rectangle 들에 총 넓이를 리턴 하는 함수를 만드시오.
 */

package com.kosmo.today.test;
import java.util.Scanner;

public class TodayTest10_Rect3_StaticMethod {

	public static void main(String[] args) {
		Rect[] ra = new Rect[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 세로 값을 입력하세요(총3번입력)");
		//
		//??지역변수는 , 초기화 0 자동 , 않되나?
		//
		int tarea = 0;
		for(int i=0; i<ra.length; i++) {
			System.out.println("가로:");
			int w = sc.nextInt();
			System.out.println("세로:");
			int h = sc.nextInt();
			ra[i] = new Rect(w,h);
			tarea += ra[i].getArea();
		}
		System.out.println("총넓이의 합: "+ tarea);
		System.out.println("총넓이함(static 함수사용): " + Rect.getTotalArea(ra));

	}
}

class Rect{
	private int w;
	private int h;
	
	Rect(int w, int h){
		this.w = w;
		this.h = h;
	}
	int getArea() {
		return w*h;
	}
	static int getTotalArea(Rect[] ra) {
		int sum = 0;
		
//		for(int i= 0; i<ra.length; i++) {
//			//sum += ra.getArea();
//			sum += ra[i].getArea();
//		}
		
		//
		// 주의 : each 부분은 array의 1개를 의미함. 그래서 Rect e를 사용해야함 (Rect[] 사용하면 않됨)
		//		OK : for(Rect e : ra) 
		//      NG : for(Rect[] e : ra) 
		//		
		for(Rect e : ra) {
			sum += e.getArea();
		}
		return sum;
	}

}





