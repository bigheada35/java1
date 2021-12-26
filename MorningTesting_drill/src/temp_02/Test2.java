package temp_02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Circle{
	private int radius;
	private double area;
	Circle(int radius){
		this.radius = radius;
	}
	public double getArea() {
		double area = radius*radius*Math.PI;
		return area;
	}
}

public class Test2 {
	public static void main(String[] args) {
		testCircle();
	}
	public static void testCircle() {
		System.out.println("반지름을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int radius=0;
		try {
			radius = sc.nextInt();	
		} catch (Exception e) {
			System.out.println("잘못된 입력 입니다.");
			testCircle();
		}
			
		
		Circle cr = new Circle(radius);
		System.out.println(cr.getArea() + "입니다.");
	}
}
 

