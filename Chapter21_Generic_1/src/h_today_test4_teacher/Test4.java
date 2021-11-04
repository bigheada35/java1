package h_today_test4_teacher;
public class Test4 {
	public static void main(String[] args) {
		//제네릭 메소드의 T는 메소드 호출 시점에 결정한다
		//제네릭 메소드의 제한된 타입 매개변수 선언 으로 불가.->(1) 
//(1)불가:Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);   // 7.59에 대해 오토 박싱 진행됨
		//다음과 같이 타입 인자 생략 가능
//불가:	Box<String> sBox2 = BoxFactory.<String>makeBox("Sweet2");
		Box<Double> dBox2 = BoxFactory.<Double>makeBox(7.592);   // 7.59에 대해 오토 박싱 진행됨

//불가	System.out.println(sBox.get());
		System.out.println(dBox.get());
//불가	System.out.println(sBox2.get());
		System.out.println(dBox2.get());		
	}
}

class BoxFactory {
	//public static <T> Box<T> makeBox(T o) {
	//제네릭 메소드의 제한된 타입 매개변수 선언
	public static <T extends Number> Box<T> makeBox(T o) {
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
