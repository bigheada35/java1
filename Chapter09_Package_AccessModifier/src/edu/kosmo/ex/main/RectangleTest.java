package edu.kosmo.ex.main;
/*
	import 꼭 시키기
*/

/* 지금은 다른 페키지에 있으니깐. import 해 줘야 함 */
import edu.kosmo.ex.shape.Circle;

import edu.kosmo.ex.shape.Rectangle;

/*
 *출력:
			(2,2)에서 크기가 8x7인 사각형
			s의 면적은 36
			t는 r을 포함합니다

 */
public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	
		/* 지금은 다른 페키지에 있으니깐. import 해 줘야 함 */
		Circle circle = new Circle();
		
	}

}
