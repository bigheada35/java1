package ch21_p16;

public class TestGen {
	//인스턴스 생성 시 타입 인자로 Number 또는 이를 상속하는 클래스만 올 수 있음
	public static void main(String[] args) {
		   Box<Integer> iBox = new Box<>(); 
		   iBox.set(24);

		   System.out.println(iBox.get());
		   
		   Box<Double> dBox = new Box<>(); 
		   dBox.set(5.97);
		   
		   System.out.println(dBox.get());
	}
}
//인스턴스 생성 시 타입 인자로 Number 또는 이를 상속하는 클래스만 올 수 있음
class Box<T extends Number> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}
/*
 결과:
 	24
	5.97
*/
