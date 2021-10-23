package c15.p13;



class Cake {
	public void yummy() {System.out.println("1111");}
}

class CheeseCake extends Cake {
	public void yummy() {System.out.println("2222");} // Cake의 yummy를 오버라이딩
}

class StrawberryCheeseCake extends CheeseCake{

	public void yummy() {System.out.println("3333");} // 그리고 CheeseCake의 yummy를 오버라이딩
}


// 메소드 오버라이딩 2

public class c15_13 {

	public static void main(String[] args) {
		   Cake c1 = new StrawberryCheeseCake();
		   
		   CheeseCake c2 = new StrawberryCheeseCake();
		   
		   StrawberryCheeseCake c3 = new StrawberryCheeseCake();
		   
		   c1.yummy();   
		   c2.yummy();
		   c3.yummy();
	}

}
