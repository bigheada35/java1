package i_test_override_equals_toString;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

/*
 결과: 
 
원 a : Circle(2,3)반지름5
원 b : Circle(2,3)반지름30
같은 원

 */

public class Test6 {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);//중심(2,3)에 반지름5인 원
		Circle b = new Circle(2,3,30);//중심(2,3)에 반지름30인 원
		
		System.out.println("원a:" + a);
		System.out.println("원b:" + b);
		
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
		
		
	}

}
class Circle{
	private int x,y,r;
	Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	@Override
	public boolean equals(Object obj) {
		//형변환.
		Circle c = (Circle)obj;
		
		//형변환 가능하냐?
		if( obj instanceof Circle) {
			if((this.x == c.x) && (this.y == c.y))
				return true;
			else 
				return false;
		}
		return false;
	}
	@Override
	public String toString() {
		return ("Circle(" + x + "," + y + ")반지름" + r);
	}

}
