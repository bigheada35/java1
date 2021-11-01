package t041_circle_override_toString_equals;

/*
 public static void main(String[] args) {
                Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
                Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원

                System.out.println("원 a : " + a);
                System.out.println("원 b : " + b);

               if(a.equals(b))
                        System.out.println("같은 원");
                else
                System.out.println("서로 다른 원");
       //
        원 a : Circle(2,3)반지름5
        원 b : Circle(2,3)반지름30
        같은 원
        //
 */

public class Test41 {
	public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
        Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원

        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);

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
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		//if(this.x == c.x && this.x == c.y && this.r == c.r) {
		if(this.r == c.r) {
			return true;
		}else
			return false;
	}
	public String toString() {
		return ("Circle(" +this.x +","+ this.y +")반지름" + this.r);
	}
}

/*
 결과:
	 원 a : Circle(2,3)반지름5
	원 b : Circle(2,3)반지름30
	서로 다른 원
 * 
 */

