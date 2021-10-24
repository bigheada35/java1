package c15.p18;

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}

/*
 * instanceof 연산자의 활용
 * 
 * “상속은 연관된 일련의 클래스들에 대해 공통적인 규약을 정의할 수 있습니다.“
 * 
 * instanceof 연산자의 사용 예! 그런데 이 예제 코드의 완성도에 점수를 준다면?
 * 
 */

public class c15_p18 {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		System.out.println("-1-");
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		System.out.println("-2-");
		
		Box box11 = new PaperBox();
		wrapBox(box11);
	}

	public static void wrapBox(Box box) {
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox) box).goldWrap();
		} else if (box instanceof PaperBox) {
			((PaperBox) box).paperWrap();
		} else {
			box.simpleWrap();
		}
	}

}
