package t25;

import java.util.Scanner;

public class Test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		int r = sc.nextInt();
		
		Circle cr = new Circle(r);
		cr.space();
	}

}
class Circle{
	private int radius;
	Circle(int radius){
		this.radius = radius;
	}
	void space() {
		System.out.println(radius*radius*Math.PI);
	}
}
