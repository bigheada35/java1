package d_today_tests5;

class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}


public class Test5 {
 
	public static void main(String[] args) {
		Box<String> sBox = new Box<>();
		sBox.set("I am so happy.");
	
		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());

        
	}

}
/*
 	설명 : 	zBox.get() 통해서 얻은 것은 wBox의 주소값이고 (zBox안의 ob는  wBox)
 			wBox.get() 통해서 얻는 것은 sBox의 주소값이다.(wBox안의 ob는 sBox)
 			그래서,
 	
 			zBox.get().get().get() ==>		wBox.get().get()  ==>  sBox.get()
 			
 			된다.
 			(sBox안의 ob는 "I am so happy.")
 			그래서 sBox.get() 결과는  "I am so happy." 가 된다.
			
  
 */

/*
아래의 소스코드 중에 System.out.println(zBox.get().get().get()); 부분을 설명하시오.
*/