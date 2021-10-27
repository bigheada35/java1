package c17_p18_abstract_class;

public class Test1 {
	public static void main(String[] args) {
		// 에러 : Cannot instantiate the type House
		//House ha = new House();
		Tent te = new Tent();
		te.methodTwo();
		System.out.println("----");
		House ha = new Tent();
		ha.methodOne();
		ha.methodTwo();
	}

}

// 에러 발생 : The public type House must be defined in its own file
//public abstract class House {
// 에러 : The public type House must be defined in its own file
//abstract class House { // 추상 클래스

// 에러 : The type House must be an abstract class to define abstract methods
//class House { // 추상 클래스

abstract class House { // 추상 클래스
	public void methodOne() {
		System.out.println("method one");
	}

	public abstract void methodTwo(); // 추상 메소드
}

class Tent extends House{
	
	Tent(){
		
	}
	
	@Override
	public void methodTwo() {// 추상 메소드
		System.out.println("22 method one");
	}
	
}