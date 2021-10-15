package C;

class Circle{
	int radius;
	public void setter(int r) {
		radius = r;
	}
	public int getter() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}

public class MorningTest {

public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
원의 넓이는 구하는 프로그램을 아래와 같이 작성하시오.
  - 원클래스를 만들것
    - 변수 radius
    - 변수 radius에 대한 setter getter 함수 만들것
    - getArea 함수
  
  -메인 메소드를 가진 다른 클래스(AreaTest)에서 원 객체를 생성할것
 * 
 * 
 */		Circle circle = new Circle();
 		circle.setter(1);
 		System.out.println("getArea: "+ circle.getArea());
	}

}
