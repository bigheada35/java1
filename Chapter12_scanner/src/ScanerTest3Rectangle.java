import java.util.Scanner;
public class ScanerTest3Rectangle {

	public static void main(String[] args) {
		
		System.out.println("가로 세로 입력 하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		System.out.println( w + " " + h);
		
		Rectangle rec = new Rectangle(w, h);
		System.out.println("넓이는" + rec.getArea() + "입니다.");
		
	}
}

