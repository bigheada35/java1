package B;

 class B{
				//인스턴스 변수
	int num=100;//인스턴스 변수
				
	public void printSum() {
		System.out.println(num);
	}
}

class Rectangle{
	//static int width;
	//static int height;
	int width;
	int height;	
	//-------------
	//자동으로 만든것
	//-------------
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
//	Rectangle(){
//		System.out.println("-Rectangle-");
//	}
	
	//-------------
	// 손으로 만든것
	//-------------
	
	/*
	//setter 함수
	public void setWidth(int n) {
		width = n;
	}
	//getter 함수
	public int getWidth() {
		return width;
	}
	
	*/
	public int getArea() {
		return width*height;
	}
	
}

public class BClassTest {

	public static void main(String[] args) {
		
		B2 b = new B2();
		b.printSum();
		
		B b2 = new B();
		b2.printSum();
		
		Rectangle rec = new Rectangle();
		rec.width = 10;
		rec.height = 10;
		rec.setWidth(30);
		System.out.println(rec.width);
		System.out.println(rec.getWidth());
		
		System.out.println(rec.getArea());
		
		Rectangle rec2 = new Rectangle();
		System.out.println("---"+rec2.getArea());
	}

}
