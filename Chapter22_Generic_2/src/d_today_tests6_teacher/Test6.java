package d_today_tests6_teacher;
public class Test6 {
 
	public static void main(String[] args) {
        Box7<Integer> box1 = new Box7<>();
        box1.set(99);

        Box7<Integer> box2 = new Box7<>();
        box2.set(55);

        System.out.println(box1.get() + " & " + box2.get());
        
        swapBox(box1, box2); 
        
        System.out.println(box1.get() + " & " + box2.get());
        
	}
//	public static <T> void swapBox(Box7<T> o , Box7<T> p) {
//		Box7<T> a = new Box7<T>();
//		a.set(o.get());
//		o.set(p.get());
//		p.set(a.get()); 
//
//	}
//	public static void swapBox(Box7<Integer> box1 , Box7<Integer> box2) {
//		Integer temp = box1.get();
//		box1.set(box2.get());
//		box2.set(temp);
//	}
	public static <T>void swapBox(Box7<T> box1 , Box7<T> box2) {
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
	}
}

class Box7<T>{
	private T o;
	public void set(T o) {
		this.o = o;
	}
	public  T get() {
		return (this.o);
	}
	public String toString() {
		return o.toString();
	}
}

/*
결과:

*/

/*
public static void main(String[] args) {
        Box7<Integer> box1 = new Box7<>();
        box1.set(99);

        Box7<Integer> box2 = new Box7<>();
        box2.set(55);

        System.out.println(box1.get() + " & " + box2.get());
        swapBox(box1, box2); 
        System.out.println(box1.get() + " & " + box2.get());
    }

출력 =========================================

99 & 55
55 & 99


*/