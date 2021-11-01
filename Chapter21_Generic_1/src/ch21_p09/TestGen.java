package ch21_p09;

public class TestGen {

	public static void main(String[] args) {
		//제네릭 이후의 코드: 개선된 결과
		//
		// 인스턴스 생성시 결정이 되는 자료형의 정보를 T로 대체한다.
		//
		//Box aBox = new Box(); 
		Box<Apple> aBox = new Box<Apple>();//T를 Apple로 결정하여 인스턴스 생성
		//따라서 Apple 또는 Apple을 상속하는 하위 클래스의 인스턴스 저장 가능
		
		//Box oBox = new Box();
		Box<Orange> oBox = new Box<Orange>();//T를 Orange로 결정하여 인스턴스 생성
		//따라서 Apple 또는 Apple을 상속하는 하위 클래스의 인스턴스 저장 가능

		//aBox.set("Apple"); 
		//잘못 넣은 경우 이클립스 에러 : 
			//The method set(Apple) in the type Box<Apple> 
			//is not applicable for the arguments (String)
		
		aBox.set(new Apple());   // 사과를 상자에 담는다.
		oBox.set(new Orange());   // 오렌지를 상자에 담는다.
		
		Apple ap = aBox.get();   // 사과를 꺼내는데 형 변환 하지 않는다.
		Orange og = oBox.get();   // 오렌지를 꺼내는데 형 변환 하지 않는다.

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

//class Box<T> {
class Box<T> {  // 인스턴스 생성시 결정이 되는 자료형의 정보를 T로 대체한다. 
	//private Object ob;
	private T ob;
	//public void set(Object o) {
	public void set(T o) {
		ob = o;
	}
	//public Object get() {
	public T get() {
		return ob;
	}
}
