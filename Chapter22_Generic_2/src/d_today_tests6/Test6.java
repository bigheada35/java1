package d_today_tests6;
public class Test6 {
 
	public static void main(String[] args) {
        Box7<Integer> box1 = new Box7<>();
        box1.set(99);

        Box7<Integer> box2 = new Box7<>();
        box2.set(55);

        System.out.println(box1.get() + " & " + box2.get());
        
        swapBox(box1, box2); 
        
        System.out.println(box1.get() + " & " + box2.get());

//        System.out.println(box1.get() + " & " + box2.get());
//       swapBox2(box1, box2); 
//        System.out.println(box1.get() + " & " + box2.get());

        
	}
	public static <T> void swapBox(Box7<T> o , Box7<T> p) {
		Box7<T> a = new Box7<T>();
		a.set(o.get());
		o.set(p.get());
		p.set(a.get()); 
		
	}
//	public static <T> void swapBox2(T o , T p) {
//		T a = new T();
//		a.set(o.get());
//		o.set(p.get());
//		p.set(a.get()); 
//	}	
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