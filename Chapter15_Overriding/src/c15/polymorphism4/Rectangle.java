package c15.polymorphism4;
public class Rectangle extends Shape{
	private int w,h;
	public Rectangle(int w, int h){
		// 부모가 생성자 정의되어 있으면
		// super()를 꼭 써야 에러 안남
		//super(0);
		this.w = w;
		this.h = h;
	}
	public double getArea() {
		return w*h;
	}
}
