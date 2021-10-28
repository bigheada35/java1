package d_test2_interface;

/*
 * 
 다음 main() 메소드와 실행 결과를 참고하여,
 Shape 인터페이스를 구현한 클래스 Oval, Rect를 추가 작성하고 전체 프로그램을 완성하라.

public static void main(String[] args) {
   Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
   list[0] = new Circle(10); // 반지름이 10인 원 객체
   list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
   list[2] = new Rect(10, 40); // 10x40 크기의 사각형
   for(int i=0; i<list.length; i++) list[i].redraw();
   for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
}
--- 다시 그립니다.반지름이 10인 원입니다.
--- 다시 그립니다.20x30에 내접하는 타원입니다.
--- 다시 그립니다.10x40크기의 사각형 입니다.
면적은 314.0
면적은 1884.0000000000002
면적은 400.0
 */

public class Test222 {

	public static void main(String[] args) {

		Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		//list[1] = new Oval(50, 40); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		
		for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
		
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
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public void setRadius(int r){
		radius = r;
	}

	// 주의: public을 안붙이면 나오는 에러 --> 
	//Cannot reduce the visibility of the inherited method from Shape
	@Override
	public void draw(){
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	@Override
	public double getArea(){
		return (PI*radius*radius);
	}
}

class Oval implements Shape{
	private int r;
	private int w,h;
	Oval(int w, int h){
		this.w = w;
		this.h = h;
		r = ((w>h)?(h):(w))/2;
	}
	@Override
	public void draw(){
		System.out.println(w+"x" + h + "에 내접하는 타원입니다.");
	}
	@Override
	public double getArea(){
		return (PI*r*r);
	}
}


/*
//test  I (Shape) <- C (circle) <- C (Oval) 으로 시도해 봄.
class Oval extends Circle{
	private int w,h;
	
	Oval(int w, int h){
		// 주의 : 꼭 Circle의 생성자를 불러 줘야 한다. 아니면 에러 난다.
		super(1); // 이상하지만, super() 부모생성자를 호출 해야 하기에, 1을 넣음.
		// 주의 : super() 부모생성자 를 꼭 위에 올리기..
		
		this.w = w;
		this.h = h;
		int r = ((w>h)?(h):(w))/2;
		super.setRadius(r);
	}
	@Override
	public void draw(){
		//super.draw();
		System.out.println(w+"x" + h + "에 내접하는 타원입니다.");
	}
	@Override
	public double getArea(){
		return (super.getArea());
	}
}
*/

class Rect implements Shape{
	private int w,h;
	Rect(int w, int h){
		this.w = w;
		this.h = h;
	}
	@Override
	public void draw(){
		System.out.println( w +"x" + h + "크기의 사각형 입니다.");
	}
	@Override
	public double getArea(){
		return w*h;
	}
}
