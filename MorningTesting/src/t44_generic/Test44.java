package t44_generic;


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
// 주의 : 클래스에 generic 사용시, 메소드의 인자 앞의 generic 사용한는 것과 햇갈리지 않도록.
// 주의 : 클래스 --> generic 만, 메소드는 --> generic + 인자 형태로.
class DBox<L, R >{
	private L o;
	private R q;
	void set(L o, R q) {
		this.o = o;
		this.q = q;
	}
	@Override
	public String toString() {
		return (this.o + " & " + this.q);
	}
	
}
