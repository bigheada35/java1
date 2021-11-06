package t46;
public class Test46 {
	public static void main(String[] args) {
		Box7<Integer>box1 = new Box7<>();
		box1.set(99);
		
		Box7<Integer>box2 = new Box7<>();
		box2.set(55);
		
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1,box2);
		System.out.println(box1.get() + " & " + box2.get());
	}
	public static void swapBox(Box7<Integer> a, Box7<Integer> b) {
		Box7<Integer> tmp = new Box7<Integer>();
		tmp.set(a.get());
		a.set(b.get());
		b.set(tmp.get());
	}
	
}
class Box7<T>{
	private T num;
	public void set(T n) {
		this.num = n;
	}
	public T get() {
		return num;
	}
}

