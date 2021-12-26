package t19;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		Circle cir = new Circle(3);
		cir.getArea();

	}

}

class Circle{
	private double radius, area;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		this.area = radius*radius*Math.PI;
		System.out.println(area);
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;

	}

}




/*
원의 넓이는 구하는 프로그램을 아래와 같이 작성하시오.
  - 원클래스를 만들것
    - 변수 radius
    - 변수 radius에 대한 setter getter 함수 만들것
    - getArea 함수
  
  -메인 메소드를 가진 다른 클래스(AreaTest)에서 원 객체를 생성할것 

*/