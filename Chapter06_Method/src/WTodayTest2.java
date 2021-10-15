class Circle{
	int radius;
	
	public double getArea() {
		double PI = Math.PI;
		return radius*radius*PI; 
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}



public class WTodayTest2 {

	public static void main(String[] args) {
		/*

  - 원클래스를 만들것
    - 변수 radius
    - 변수 radius에 대한 setter getter 함수 만들것
    - getArea 함수
  
	-메인 메소드를 가진 다른 클래스(AreaTest)에서 원 객체를 생성할것
	
		 */
		
		Circle circle = new Circle();
		circle.setRadius(1);
		double area = circle.getArea();
		System.out.println(area);
	}
	


}
