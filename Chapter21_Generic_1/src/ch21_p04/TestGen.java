package ch21_p04;

public class TestGen {

	public static void main(String[] args) {
		// 제네릭 이전의 코드의 사용의 예

		Box aBox = new Box(); // 상자 생성
		Box oBox = new Box(); // 상자 생성

		aBox.set(new Apple()); // 상자에 사과를 담는다.
		oBox.set(new Orange()); // 상자에 오렌지를 담는다.

		Apple ap = (Apple) aBox.get(); // 상자에서 사과를 꺼낸다.
		Orange og = (Orange) oBox.get(); // 상자에서 오렌지를 꺼낸다.
		
		// 어쩔 수 없이 형 변환의 과정이 수반된다.
		// 그리고 이는 컴파일러의 오류 발견 가능성을 낮추는 결과로 이어진다.
		
		System.out.println(ap);
		System.out.println(og);

	}

}

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

// 다음 상자는 사과도 오렌지도 담을 수 있다.
class Box { // 무엇이든 저장하고 꺼낼 수 있는 상자
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}
