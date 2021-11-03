package t44;
public class Test44 {
	public static void main(String[] args) {
			DBox<String, Integer> box = new DBox<String, Integer>();
			box.set("Apple", 25);
			System.out.println(box);
			
			DBox<String, String> box2 = new DBox<String,String>();
			box2.set("Apple", "Orange");
			System.out.println(box2);
	}
}
class DBox<L,R>{
	private L o;
	private R q;
	void set(L o, R  q) {
		this.o = o;
		this.q = q;
	}
	@Override
	public String toString() {
		return (o + " & " + q);
	}
}


/*
결과: 
Apple & 25
Apple & Orange
	*/

/*
public static void main(String[] args) {
	DBox<String, Integer> box = new DBox<String, Integer>();
	box.set("Apple", 25);
	System.out.println(box);
	
	DBox<String, String> box2 = new DBox<String,String>();
	box2.set("Apple", "Orange");
	System.out.println(box2);
}

아래와 같이 출력 되도록 하시오.
================================================
Apple & 25
Apple & Orange
 */
