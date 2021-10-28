package d_test1_interface;

/*
 다음 main() 메소드를 참고하여, 
인터페이스 Shape을 구현한 클래스 Circle를 작성하고 전체 프로그램을 완성하라.

결과:
--- 다시 그립니다.반지름이 10인 원입니다.
면적은 314.0

 */

public class Test22 {

	public static void main(String[] args) {
		
		   Shape donut = new Circle(10); // 반지름이 10인 원 객체
		   donut.redraw();
		   System.out.println("면적은 "+ donut.getArea());
		
	}

}


interface Shape {
	final double PI = 3.14; // 상수

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle implements Shape{
	private int radius;
	Circle(int radius){
		this.radius = radius;
	}
	// 주의: public을 안붙이면 나오는 에러 --> 
	//Cannot reduce the visibility of the inherited method from Shape
	public void draw(){
		System.out.println("다시 그립니다.반지름이 " + radius + "인 원입니다");
	}
	public double getArea(){
		return (PI*radius*radius);
	}
}



