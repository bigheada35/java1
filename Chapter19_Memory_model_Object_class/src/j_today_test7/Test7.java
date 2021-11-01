package j_today_test7;

import java.util.Scanner;

/*
7.철수 학생은 다음 3개의 필드와 메소드를 가진 4개의 클래스 Add, Sub, Mul, Div를 작성하려고 한다.

- int 타입의 a, b 필드: 2개의 피연산자
- void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
- int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.

곰곰 생각해보니, Add, Sub, Mul, Div 클래스에 공통된 필드와 메소드가 존재하므로 새로운 추상 클래스 Calc를 작성하고,
 Calc를 상속받아 만들면 되겠다고 생각했다. 
그리고 main() 메소드에서 다음 실행 사례와 같이 2개의 정수와 연산자를 입력받은 후, 
Add, Sub, Mul, Div 중에서 이 연산을 처리할 수 있는 객체를 생성하고 setValue() 와 calculate()를 호출하여 
그 결과 값을 화면에 출력하면 된다고 생각하였다. 

철수처럼 프로그램을 작성하라.(예외처리 구문도 넣어 주세요^^)

두 정수와 연산자를 입력하시오 >> 5 7 +
 */

public class Test7 {

	public static void main(String[] args) {
		Calc calc = null;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("두 정수와 연산자를 입력하시오 >>");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			String str = sc.next();
			
			switch(str) {
			case "+":
				calc = new Add(n1, n2);
				break;
			case "-":
				calc = new Sub(n1, n2);
				break;
			case "*":
				calc = new Mul(n1, n2);
				break;
			case "/":
				calc = new Div(n1, n2);
				break;			
			}
			//calc.calculate();
			System.out.println(" = " + calc.calculate());
		}catch(Exception e) {
			e.printStackTrace();
		}
		//finally {
		//	System.out.println(" = " + calc.calculate());	
		//}
		
		

	}

}

abstract class Calc{
	protected int a;
	protected int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();
}
class Add extends Calc{
	Add(int a, int b){
		setValue(a,b);
	}
	@Override
	public int calculate() {
		return (a+b); 
	}
}
class Sub extends Calc{
	Sub(int a, int b){
		setValue(a,b);
	}
	@Override
	public int calculate() {
		return (a-b); 
	}	
}
class Mul extends Calc{
	Mul(int a, int b){
		setValue(a,b);
	}
	@Override
	public int calculate() {
		return (a*b); 
	}	
}
class Div extends Calc{
	Div(int a, int b){
		setValue(a,b);
	}
	@Override
	public int calculate() {
		return (a/b); 
	}	
}