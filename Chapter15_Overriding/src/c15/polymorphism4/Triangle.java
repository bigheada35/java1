package c15.polymorphism4;
public class Triangle extends Shape{
	private int w,h;
	public Triangle(int w, int h){
		//super(0);
		this.w = w;
		this.h = h;
	}
	public double getArea() {
		return w*h/(double)2;
	}
}
