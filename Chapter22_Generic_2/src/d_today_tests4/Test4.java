package d_today_tests4;

public class Test4 {

	public static void main(String[] args) {
		Toy toy = new Toy();
		Box<Toy> box = new Box<Toy>();
		
		BoxHandler.inBox( box, toy); 
		System.out.println(box.get());
		
		BoxHandler.outBox(box);

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

class Toy extends Plastic{
	public String toString() {
		return "I am a Toy";
	}
}

class Plastic {
	public String toString() {
		return "plastic";
	}
}

class BoxHandler {
	public static void outBox(Box<Toy> box) {
		Toy t = box.get(); // 상자에서 꺼내기
		System.out.println(t);
	}

	//public static void inBox(Box<Toy> box, Toy n) {
	public static void inBox(Box<? super Toy> box, Toy n) {
		box.set(n); // 상자에 넣기
		
//		Toy myToy = box.get();   // 꺼내는 것! Error!
	}
}