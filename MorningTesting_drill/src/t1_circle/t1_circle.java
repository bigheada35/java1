package t1_circle;

import java.util.Scanner;

public class t1_circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		int radius = sc.nextInt();
		Circle circle = new Circle(radius);
		circle.Space();
	}
}
class Circle{
	private int radius;
	private double space;
	Circle(int radius){
		this.radius = radius;
	}
	void Space() {
		System.out.println("면적"+ radius*radius*Math.PI);
	}
}


