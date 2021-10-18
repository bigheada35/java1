import java.util.Scanner;

public class TestMornig3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 세로 입력 하세요.");
		int rec_w = sc.nextInt();
		int rec_h = sc.nextInt();
		System.out.println(rec_w);
		System.out.println(rec_h);
		
		
		Rectangle2 rec = new Rectangle2(rec_w, rec_h);
		System.out.println("넓이는 :" + rec.getArea() + "입니다.");
	}

}

class Rectangle2{
	
	private int width;
	private int height;
	Rectangle2(int width, int height){
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return width * height;
	}
}
