package com.kosmo.ex.teacher;

public class Circle {
	
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	public double getArea() {
		return r*r*Math.PI;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	
	// 인스턴스의 변수에 영향이 없는 경우에는  , static 붙여서 사용하는 것도 좋다.
	//public double getArrArea(Circle[] cirArr) {
	public static double getArrArea(Circle[] cirArr) {
		//총 원넓이 계산
		double sum = 0;
		
		for(int i =0; i<cirArr.length; i++) {
			sum += cirArr[i].getArea(); 
			System.out.println(cirArr[i].getR());
		}
		return sum;
	}

}

