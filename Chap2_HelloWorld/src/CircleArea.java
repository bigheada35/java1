
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이클립스로 java_area 프로젝트를 만들고, 
		아래의 조건으로 프로그램하시오.
		
		CircleArea.java 파일을 만들고
		
		원의 반지름 5.6 을 담는 변수 선언.
		PI 상수로 선언 
		
		원의 넓이 공식 파이알의제곱을 담는 변수 선언 하여 
		넓이를 담고 출력
		 * 
		 */
		double circle_r = 5.6;
		final double PI = 3.14;
		
		double circle_space = circle_r * circle_r * PI;
		System.out.println("circle_space is " + circle_space);
		
	}

}
