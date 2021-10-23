package c15.p17;

class Cake {
}

class CheeseCake extends Cake {
}

class StrawberryCheeseCake extends CheeseCake {
}

// instanceof 연산자의 기본
/*
 if(ref instanceof ClassName)
 ref가 ClassName 클래스의 인스턴스를 참조하면 true 반환
 ref가 ClassName를 상속하는 클래스의 인스턴스이면 true 반환

 */

public class c15_17 {

	public static void main(String[] args) {
		
		   Cake cake = new StrawberryCheeseCake();
		   
		   if(cake instanceof Cake) {System.out.println("111");}
		   
		   if(cake instanceof CheeseCake) {System.out.println("222");}

		   if(cake instanceof StrawberryCheeseCake) {System.out.println("333");}
		}

}
