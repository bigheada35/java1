package t26;

import java.util.Scanner;

public class Test26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로세로 입력하세요");
		int w = sc.nextInt();
		int h = sc.nextInt();
		Rectangle rec = new Rectangle(w, h);
		rec.area();
		
	}

}

class Rectangle{
	private int w, h;
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
			
	}
	void area(){
		System.out.println("넓이는" + this.w*this.h + "입니다.");
	}
}

