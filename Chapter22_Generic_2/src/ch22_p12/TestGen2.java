package ch22_p12;
public class TestGen2 {
 
	public static void main(String[] args) {
	

	
	}



}

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class Toy {
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler {
	public static void outBox(Box<Toy> box) {
		Toy t = box.get(); // 상자에서 꺼내기
		System.out.println(t);
	}

	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n); // 상자에 넣기
	}
}
