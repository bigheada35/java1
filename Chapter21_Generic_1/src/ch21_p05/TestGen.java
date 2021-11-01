package ch21_p05;

public class TestGen {

	public static void main(String[] args) {
		// 제네릭 이전 코드가 갖는 문제점 1

		Box aBox = new Box(); // 상자 생성
		Box oBox = new Box(); // 상자 생성

		//aBox.set(new Apple()); // 상자에 사과를 담는다.
		//oBox.set(new Orange()); // 상자에 오렌지를 담는다.
		aBox.set("Apple"); //사과와 오렌지가 아닌 '문자열'을 담았다
		oBox.set("Orange"); //사과와 오렌지가 아닌 '문자열'을 담았다
		
		
		// 상자에 과일이 담기지 않았는데 과일을 꺼내려 한다
		Apple ap = (Apple) aBox.get(); // --> /// 예외 발생
		Orange og = (Orange) oBox.get(); // 상자에 과일이 담기지 않았는데 과일을 꺼내려 한다
		
		// 어쩔 수 없이 형 변환의 과정이 수반된다.
		// 그리고 이는 컴파일러의 오류 발견 가능성을 낮추는 결과로 이어진다.

/*
  결과: 
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class ch21_p05.Apple (java.lang.String is in module java.base of loader 'bootstrap'; ch21_p05.Apple is in unnamed module of loader 'app')
	at ch21_p05.TestGen.main(TestGen.java:18)

 */
		
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
