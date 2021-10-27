//아래의 인터페이스에 맞추어(상속하여) 아래를 프로그래밍 하시오.
//Circle, Rectangle , Triangle

package d_ex2_interface_AreaGetable;

public class Test1 {
	public static void main(String[] args) {
		AreaGetable area = new Circle(4);
		System.out.println(area.getArea());

		area = new Rectangle(4,5);
		System.out.println(area.getArea());

		area = new Triangle(4,5);
		System.out.println(area.getArea());
	}
}

interface AreaGetable{
	//
	// 주의 : Abstract 가 있는 것.
	//
	double getArea();
}

class Circle implements AreaGetable{
	private int r;
	Circle(int r){
		this.r = r;
	}
	//
	// 주의 : 꼭 public 사용
	//
	public double getArea(){
		return r*r*Math.PI;
	}
}
class Rectangle implements AreaGetable{
	private int w,h;
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	//
	// 주의 : 꼭 public 사용
	//	
	public double getArea(){
		return w*h;
	}
}
class Triangle implements AreaGetable{
	private int w,h;
	Triangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	//
	// 주의 : 꼭 public 사용
	//	
	public double getArea(){
		return w*h/2;
	}
}

