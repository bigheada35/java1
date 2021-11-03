package g_today_test5;
import java.util.Arrays;
public class Prog {
	public static void main(String[] args) {
		Rectangle[] recArr = { new Rectangle(6, 6), new Rectangle(5, 5), new Rectangle(10, 10), new Rectangle(12, 12),
				new Rectangle(11, 11) };

		// RecArrays.sort(recArr);
//		for (Rectangle rectangle : recArr) {
//			System.out.println(rectangle);
//		}
//		System.out.println();
		System.out.println(Arrays.toString(recArr));

		Arrays.sort(recArr);

		for (Rectangle rectangle : recArr) {
			System.out.println(rectangle);
		}
		System.out.println();
		for (Rectangle rec : recArr) {
			System.out.println(rec.getArea());
		}
		System.out.println(Arrays.toString(recArr));
	}
}

class Rectangle implements Comparable{
	private int w,h;
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	int getArea() {
		return (w*h);
	}
	@Override
	public int compareTo(Object obj) {
		Rectangle rec = (Rectangle)obj;
		//return (this.w - rec.w);
		//return (this.getArea() - rec.getArea());
		return (rec.getArea() - this.getArea());
	}
	@Override
	public String toString() {
		return ("("+this.w + "," + this.h +")");
	}
}

/*
결과: 
	(6,6)
	(5,5)
	(10,10)
	(12,12)
	(11,11)
	
	(5,5)
	(6,6)
	(10,10)
	(11,11)
	(12,12)
	
	25
	36
	100
	121
	144


 */

/*
5. 아래를 넓이 순서대로 출력하게끔 하시오.
      Rectangle[] recArr = {new Rectangle(6, 6),new Rectangle(5, 5),new Rectangle(10, 10),new Rectangle(12, 12),new Rectangle(11, 11)};
      
      //RecArrays.sort(recArr);
      
      Arrays.sort(recArr);
	  
	  for ( Rectangle rec: recArr) {
		 System.out.println(rec.getArea());
	  }

 */

