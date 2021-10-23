package c15.polymorphism4;
public class Circle extends Shape{
	private double r;
	public Circle(double r) {
		// 부모가 생성자 정의되어 있으면
		// super()를 꼭 써야 에러 안남
		//super(0);
		this.r = r;
	}
	public double getArea() {
		return r*r*Math.PI;
	}
}
