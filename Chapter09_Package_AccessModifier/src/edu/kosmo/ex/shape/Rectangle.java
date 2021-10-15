package edu.kosmo.ex.shape;
/*

- int 타입의 x, y, width, height 필드 : 사각형을 구성하는 점과 크기 정보
- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
- int square() : 사각형 넓이 리턴
- void show() : 사각형의 좌표와 넓이를 화면에 출력
- boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴 (겹치면 안됨. 완전히 안에 있어야 true)
- main() 메소드의 코드와 실행 결과는 다음과 같다.

 **/

public class Rectangle {

	
	/* private 꼭 붙이자. */
	
	private int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int square() {
		return width * height;
	}
	public void show() {
		System.out.println("("+ x+ "," + y + ")에서 크기가 " + width +"x" + height +"인 사각형");
	}
	/*
	 *  문법상의 오류를 먼저 해결 하기 위해서,
	 *  bool을 만들고 리턴 ,  이것을 먼저 작성한다.
	 */
	public boolean contains(Rectangle r) {
		boolean bool = false;  
		if(  (this.x < r.x) && ((r.x + r.width) < (this.x + this.width)) 
			&&	(this.y < r.y) && ((r.y + r.height) < (this.y + this.height) )
			)
		{
			bool = true;
		}
		return bool;
	}
}
