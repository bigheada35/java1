package today_test3;
public class Test3 {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);
		
        DBox<String, String> box2 = new DBox<String,String>();
        box2.set("Apple", "Orange");
        System.out.println(box2);		
	}
}
class DBox<L, R>{
	private L name;
	private R pea;
	void set(L name, R pea) {
		this.name = name;
		this.pea = pea;
	}
	@Override
	public String toString() {
		//주의 : 제너릭에서는 this.name +  this.pea 리턴은 않됨 에러남.
		//  에러내용 : The operator + is undefined for the argument type(s) L, R
		//return (this.name +  this.pea);
		
		return (this.name + " & " + this.pea);
	}
}


/* 결과:
Apple,25
Apple,Orange

*/

/*
 3.아래와 같이 결과 값이 나오도록 만드시오.
  public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box);
        
        DBox<String, String> box2 = new DBox<String,String>();
        box2.set("Apple", "Orange");
        System.out.println(box2);

Apple & 25
Apple & Orange


*/