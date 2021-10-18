import java.util.Scanner;

public class TestMornig2 {

	public static void main(String[] args) {
		String source = "1 3 5";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력 하세요");
		int circle_r = sc.nextInt();
		System.out.println(circle_r);
		
		Circle2 cir = new Circle2(circle_r);
		System.out.println("원 넓이는 :" + cir.Area() + "입니다.");
	}

}


class Circle2{
	private int radius;
	final static double PI = 3.14; 
	Circle2(int r){
		radius = r;
	}
	double Area() {
		return radius * radius * PI; 
	}
	
}
