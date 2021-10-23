package c15.polymorphism3;

class Bird{
	
	public void fly() {
		System.out.println(" 10");
	}
}
class Sparow extends Bird{
	
	public void fly() {
		System.out.println(" 100");
	}
}

class Pizone extends Bird{
	public void fly() {
		System.out.println(" 2000");
	}
	
}

class RubBird extends Bird{
	public void fly() {
		System.out.println("x");
	}
}
//
// 실무에서 짜는 방법 -- 포함개념,  어레이, polymorphism, inheritance, overriding
//
public class c15_Polytest {

	public static void main(String[] args) {
		
		Bird[] arrBir = { new Bird(), new Sparow(), new Pizone()};
		for (Bird bird2 : arrBir) {
			bird2.fly();
		}
		
	}



}
