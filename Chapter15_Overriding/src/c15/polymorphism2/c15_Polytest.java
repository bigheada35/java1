package c15.polymorphism2;

/*

 */


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

public class c15_Polytest {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		
		bird = new Sparow();
		bird.fly();
		
		bird = new Pizone();
		bird.fly();
	}



}
