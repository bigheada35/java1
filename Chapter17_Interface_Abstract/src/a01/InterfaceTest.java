package a01;

interface Printable{
		// 주의 : 반드시 abstract 붙이기, 
		// abstract붙으면 함수 선언 가능함( 바디는 없다.)
		// public abstract 는 생략 가능 (없으면, 컴파일러가 자동 붙여 준다. )
		// 주의 : abstract = 자손이 구현하라.
		// 인터페이스는 반드시 overriding되어야 한다.
		//  final 상수등은 사용한다.
	public abstract void print(String doc);
}
class Printer implements Printable{
	public void print(String doc) {
		System.out.println(doc);
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		
		//메모리에 new 되는 부분은, class Printer implements Printable 이다.
		Printable prn = new Printer();
		prn.print("hello");
	}
}
