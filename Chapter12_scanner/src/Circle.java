//
//  cricle을 재사용 할수 있게 하기
//

//public class Circle {
class Circle {
	
	private static final double PI = 3.14;
	private int r;

	Circle(int r) {
		if (r <= 0) {
			System.out.println("err");
			return;
		}
		this.r = r;
	}

	double getArea() {
		return r * r * PI;
	}
	
	double circumference() {
		return 2*PI*r; 
	}
	
	
	int getRadius() {
		return r;
	}
	void setRadius(int radius) {
		

		this.r = radius;
	}
	

}
