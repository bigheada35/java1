package t39_test_21_11_03;

import java.util.Arrays;

public class Test39 {
	public static void main(String[] args) {
		AreaGetable[] area = { new Rectangle(4, 5), new Circle(4) };

		System.out.println(getAllArea(area));

	}
	public static double getAllArea(AreaGetable[] area) {
		double sum = 0;
		for (AreaGetable areaGetable : area) {
			sum += areaGetable.getArea();
		}
		return sum;
	}

}

interface AreaGetable {
	double getArea();
}

class Circle implements AreaGetable {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {

		return r * r * Math.PI;
	}
}

class Rectangle implements AreaGetable {

	private double width, height;

	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {

		return width * height;
	}
}

/*
 결과:
70.26548245743669
 */




/* 아래의 인터페이스에 맞추어(상속하여) 아래를 프로그래밍 하시오.

Circle, Rectangle , Triangle



interface AreaGetable{ double getArea(); }


class Circle implements AreaGetable{ 
	private double r;

	public Circle(double r) { this.r = r; }

@Override 
public double getArea() {

return r * r * Math.PI; } }

class Rectangle implements AreaGetable{

private double width,height;

public Rectangle(double width,double height) { this.height = height;
this.width = width; }

@Override public double getArea() {

return width * height; } }


class CondOp {


public static void main(String[] args) {

AreaGetable[] area = {new Rectangle(4,5),new Circle(4)};

//AreaGetable oneArea = new Circle(4); System.out.println( getAllArea(area)
);

//oneArea = new Rectangle(4,5); //System.out.println(area.getArea());

} }

 */
