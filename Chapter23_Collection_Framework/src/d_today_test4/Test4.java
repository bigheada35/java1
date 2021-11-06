package d_today_test4;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Test4 {
	public static final int CNT = 10;
	public static void main(String[] args) {
		List<Circle> list = new ArrayList<>();
		for(int i=1; i<= CNT; i++) {
			Circle circle = new Circle(i);
			list.add(circle);
		}
		double sum = 0;
		for (Circle circle : list) {
			sum += circle.area();
			System.out.println(circle);
		}
		System.out.println("원넓이 합:" + sum);
		
	}
}
class Circle{
	private int r;
	Circle(int r){
		this.r = r;
	}
	double area() {
		return r*r*Math.PI;
	}
	@Override
	public String toString() {
		return String.valueOf(area());
	}
}


/*
- 원객체 생성
- ArrayList 에 차례대로 반지름이 1인 원 부터 10인원을 입력.
- 차례대로 각각의 원 넓이 출력 
- 10개의 원넓이 합산 하여 출력.
*/