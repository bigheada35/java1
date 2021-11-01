package ch21_p06;

public class TestGen {

	public static void main(String[] args) {
		// 프로그래머의 실수가 실행 과정에서 조차 발견되지 않을 수 있다. 정말 큰 문제!!!
		Box aBox = new Box(); // 상자 생성
		Box oBox = new Box(); // 상자 생성

		aBox.set("Apple"); //사과와 오렌지가 아닌 '문자열'을 담았다
		oBox.set("Orange"); //사과와 오렌지가 아닌 '문자열'을 담았다

		System.out.println(aBox.get());
		System.out.println(oBox.get());
/*
  결과: 
	Apple
	Orange
 */
		// 상자에 과일이 담기지 않았는데 과일을 꺼내려 한다
		//Apple ap = (Apple) aBox.get(); // --> /// 예외 발생
		//Orange og = (Orange) oBox.get(); // 상자에 과일이 담기지 않았는데 과일을 꺼내려 한다

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
