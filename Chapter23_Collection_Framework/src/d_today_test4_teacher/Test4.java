package d_today_test4_teacher;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Circle{
	private double r;
	Circle(double r){
		this.r = r;
	}
	double getR() {
		return this.r;
	}
	double getArea() {
		return r*r*Math.PI;
	}
}

public class Test4 {
	
	public static void main(String[] args) {
		// 콜랙션 프레임을 사용하라 . 진도상..
		ArrayList<Circle> cirList = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			cirList.add(new Circle(i));
		}
//		for(int i=0; i<10; i++) {
//			Circle circle = cirList.get(i);
//			System.out.println(circle.getArea());
//		}
		double sum = 0;
		for (Circle circle : cirList) {
			System.out.println("반지름: " + circle.getR() + " 넓이는: " + circle.getArea());
			sum = sum + circle.getArea();
		}
		System.out.println("총 넓이는:" + sum);
		
	}
}
/*
결과: 
	반지름: 1.0 넓이는: 3.141592653589793
	반지름: 2.0 넓이는: 12.566370614359172
	반지름: 3.0 넓이는: 28.274333882308138
	반지름: 4.0 넓이는: 50.26548245743669
	반지름: 5.0 넓이는: 78.53981633974483
	반지름: 6.0 넓이는: 113.09733552923255
	반지름: 7.0 넓이는: 153.93804002589985
	반지름: 8.0 넓이는: 201.06192982974676
	반지름: 9.0 넓이는: 254.46900494077323
	반지름: 10.0 넓이는: 314.1592653589793
	총 넓이는:1209.5131716320705
*/


/*
- 원객체 생성
- ArrayList 에 차례대로 반지름이 1인 원 부터 10인원을 입력.
- 차례대로 각각의 원 넓이 출력 
- 10개의 원넓이 합산 하여 출력.
*/