package c15.p15;

class Cake {
	   public int size;
	   //System.out.println("111");
	}

class CheeseCake extends Cake {
	   public int size;
	   //System.out.println("222");
}



// 인스턴스 변수와 클래스 변수도 오버라이딩이 되는가?
/*
 * 
 --1
  2

 */

public class c15_p15 {

	public static void main(String[] args) {
		
		CheeseCake c1 = new CheeseCake();
		c1.size = 1; // CheeseCake의 size에 접근
		System.out.println("--" + c1.size);
		
		Cake c2 = new CheeseCake();
		c2.size = 2; // Cake의 size에 접근
		System.out.println("  " + c2.size);
	}

}
