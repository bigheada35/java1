package c15.p14;

class Cake {
	public void yummy() {
		System.out.println("Yummy Cake 111");
	}

}

class CheeseCake extends Cake {
	@Override
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake 222");
	}

	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake 222");
	}

}


// 오버라이딩 된 메소드 호출하는 방법

public class c15_14 {

	public static void main(String[] args) {
		
		Cake c1 = new CheeseCake();

		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		System.out.println("--");
		c2.yummy();

	}

}
