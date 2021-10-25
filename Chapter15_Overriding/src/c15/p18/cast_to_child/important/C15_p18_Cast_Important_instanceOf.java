package c15.p18.cast_to_child.important;

class Box {
	public void simpleWrap() {
		System.out.println("11 Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("22 Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("33 Gold Wrapping");
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

public class C15_p18_Cast_Important_instanceOf {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		System.out.println("----1-");
		wrapBox(box1);
		wrapBox(box2);//다형성이 적용됨
		wrapBox(box3);
		System.out.println("----2-");
		
		Box box11 = new PaperBox();
		Box box33 = new GoldPaperBox();
		
		System.out.println("---할아버지 클래스 넣으면? ---");
		//System.out.println(box11 instanceof Box);
		System.out.println(box33 instanceof Box);
		System.out.println(box33 instanceof PaperBox);
		System.out.println(box33 instanceof GoldPaperBox);
		System.out.println("----3-");
		
		wrapBox(box11);
	}

	public static void wrapBox(Box box) {
		//
		// 주의 : 사용 활용 : box로 받은 것이 GoldPaperBox 의 인스턴스라면, 형변환이 가능하다.
		//
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox) box).goldWrap();
		} else if (box instanceof PaperBox) {
				//
				//  중요 ; 캐스팅 , 뭐가 중요한 건가요?
				//	중요 : 캐스팅 ,((PaperBox) box)  <-- 중요,
				// 
				//  주의 : 	((PaperBox) box) 의미 : 
				//			PaperBox (자식으로형변환) <--- Box  (부모형변환)  <---함수진입전 :  PaperBox
				//	이것이 가능 경우는 :  부모형변환 전에 자식이였어야, 
				// 					" PaperBox (자식으로형변환) <--- Box " 
				// 					이것이 가능함.
				//
			((PaperBox) box).paperWrap();	///
		} else {
			box.simpleWrap();
		}
	}

}
