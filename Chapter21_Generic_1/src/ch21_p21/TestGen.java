package ch21_p21;
public class TestGen {
	//제네릭 메소드의 정의
	public static void main(String[] args) {
		//제네릭 메소드의 T는 메소드 호출 시점에 결정한다
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);   // 7.59에 대해 오토 박싱 진행됨
		//다음과 같이 타입 인자 생략 가능
		Box<String> sBox2 = BoxFactory.<String>makeBox("Sweet2");
		Box<Double> dBox2 = BoxFactory.<Double>makeBox(7.592);   // 7.59에 대해 오토 박싱 진행됨

		System.out.println(sBox.get());
		System.out.println(dBox.get());
		System.out.println(sBox2.get());
		System.out.println(dBox2.get());		
	}
}
//클래스 전부가 아닌 메소드 하나에 대해 제네릭으로 정의
class BoxFactory {
	public static <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<T>(); // 상자를 생성하고,
		box.set(o); // 전달된 인스턴스를 상자에 담아서,
		return box; // 상자를 반환한다.
	}
}
class Box<T> {
	T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
/* 결과:
	Sweet
	7.59
	Sweet2
	7.592
*/
