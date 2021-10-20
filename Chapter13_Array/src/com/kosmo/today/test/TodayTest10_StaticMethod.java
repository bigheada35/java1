package com.kosmo.today.test;
import java.util.Scanner;

public class TodayTest10_StaticMethod {

	public static void main(String[] args) {
		Rect[] ra = new Rect[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 세로 값을 입력하세요(총3번입력)");
		//
		//??지역변수는 , 초기화 0 자동 , 않되나?
		//
		int tarea = 0;
		for(int i=0; i<3; i++) {
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





