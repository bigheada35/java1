package com.kosmo.ex.teacher.main;
import com.kosmo.ex.teacher.Circle;

/*
 Circle을 배열로 5개 선언
 해당 객체에 인덱스 순서대로 반지름 설정
 해당 배열에 있는 Circle의 총넓이의 합을 구하시요
 */

public class CircleArray_TotalArea {

	public static void main(String[] args) {
		
		Circle c = new Circle(3);
//		System.out.println(c.getArea());
		Circle[] cirArr = new Circle[5];
		
		//원 입력
		for(int i= 0; i<cirArr.length; i++) {
			int r = (int)((Math.random()*100)+1);
			//prt(r);
			cirArr[i] = new Circle(r);
		}
		//총 원넓이 계산
		double sum = 0;
		for(int i =0; i<cirArr.length; i++) {
			
			sum += cirArr[i].getArea(); 
			System.out.println(cirArr[i].getR());
		}
		System.out.println("총넓이" + sum);
		
		System.out.println("총넓이-인스턴스 어레이 이용: " + cirArr[0].getArrArea(cirArr));
		System.out.println("총넓이-클래스 메소드 이용: " + Circle.getArrArea(cirArr));
	}
	
	static void prt(int r){
		System.out.println(r);
	}
}




